package org.island;

import org.island.model.island.Island;
import org.island.model.organisms.animals.Wolf;
import org.island.service.island.CalculateStatisticService;
import org.island.service.island.FillIslandService;
import org.island.service.island.GenerateIslandService;
import org.island.service.plants.GrowService;
import org.island.service.threadsService.AnimalLifeCycleService;
import org.island.service.threadsService.GrowTask;
import org.island.view.UserInterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {
    UserInterface userInterface = new UserInterface();

    GenerateIslandService generateIslandService = new GenerateIslandService();

    FillIslandService fillIslandService = new FillIslandService();

    GrowTask growTask = new GrowTask();

    GrowService growService = new GrowService();

    CalculateStatisticService calculateStatisticService = new CalculateStatisticService();

    AnimalLifeCycleService animalLifeCycleService = new AnimalLifeCycleService();

    public void run() {
        //view
        userInterface.initiateView();

        //generate island
        Island island = generateIslandService.generateIsland();

        //fill island
        fillIslandService.fillIsland(island);

        //Pool of animals threads
        ScheduledExecutorService scheduledAnimalLifeCycle = Executors.newScheduledThreadPool(4);
        //run grow plants simulation
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //start calculate statistic and grow plants
        Runnable task = () -> {
            growService.grow();
            calculateStatisticService.calculateStatistic();
        };

        scheduledExecutorService.scheduleWithFixedDelay(task, 1, 15, TimeUnit.SECONDS);
        animalLifeCycleService.runAnimalLifeCycle(scheduledAnimalLifeCycle);

    }
}

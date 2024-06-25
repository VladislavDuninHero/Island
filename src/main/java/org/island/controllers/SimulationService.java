package org.island.controllers;

import org.island.models.island.Cell;
import org.island.models.island.Island;
import org.island.multithreading.AnimalLifeCycle;
import org.island.multithreading.StatisticExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimulationService {
    //todo доделать многопоточку
    private final ScheduledExecutorService movingAnimals = Executors.newScheduledThreadPool(1);
    private final ScheduledExecutorService calcStatistic = Executors.newScheduledThreadPool(1);
    private final int TIME_OF_SIMULATION = 10;


    public void runSimulation(Island island) {

        Cell[][] myIsland = island.getIsland();

        AnimalLifeCycle animalLifeCycle = new AnimalLifeCycle(island);
        StatisticExecutor statisticExecutor = new StatisticExecutor(island);

        movingAnimals.scheduleAtFixedRate(animalLifeCycle, 0, 5, TimeUnit.SECONDS);
        calcStatistic.scheduleAtFixedRate(statisticExecutor, 0, 5, TimeUnit.SECONDS);

        Runnable scheduledTask = () -> {

        };
    }

}

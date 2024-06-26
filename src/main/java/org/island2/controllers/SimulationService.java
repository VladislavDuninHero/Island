package org.island2.controllers;

import org.island2.models.island.Cell;
import org.island2.models.island.Island;
import org.island2.multithreading.AnimalLifeCycle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class SimulationService {
    //todo доделать многопоточку
    private final ScheduledExecutorService movingAnimals = Executors.newScheduledThreadPool(1);
    private final ScheduledExecutorService calcStatistic = Executors.newScheduledThreadPool(1);

    private final ScheduledExecutorService eatingAnimals = Executors.newScheduledThreadPool(1);


    private final int TIME_OF_SIMULATION = 10;


    public void runSimulation(Island island) {

        Cell[][] myIsland = island.getIsland();

        AnimalLifeCycle animalLifeCycle = new AnimalLifeCycle(island);

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(animalLifeCycle);


        executorService.shutdown();
    }

}

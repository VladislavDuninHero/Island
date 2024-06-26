package org.island2.multithreading;

import org.island2.controllers.CalculateStatisticService;
import org.island2.models.island.Island;

public class StatisticExecutor implements Runnable {

    Island myIsland;

    public StatisticExecutor(Island island) {
        this.myIsland = island;
    }

    @Override
    public void run() {
        CalculateStatisticService calculateStatisticService = new CalculateStatisticService();
        calculateStatisticService.calculate(myIsland);
    }
}

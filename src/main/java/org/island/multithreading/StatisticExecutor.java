package org.island.multithreading;

import org.island.controllers.CalculateStatisticService;
import org.island.dto.Island.Island;
import utils.PrintIsland;

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

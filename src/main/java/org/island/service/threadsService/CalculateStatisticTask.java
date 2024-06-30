package org.island.service.threadsService;

import org.island.service.island.CalculateStatisticService;

public class CalculateStatisticTask implements Runnable {

    CalculateStatisticService calculateStatisticService = new CalculateStatisticService();
    public void run() {
        calculateStatisticService.calculateStatistic();
    }
}

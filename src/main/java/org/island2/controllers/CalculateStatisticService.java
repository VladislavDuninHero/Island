package org.island2.controllers;

import org.island2.models.island.Cell;
import org.island2.models.island.Island;
import org.island2.utils.PrintIsland;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CalculateStatisticService {
    //todo продумать сбор статистики
    private final AtomicInteger carnivores = new AtomicInteger(0);
    private final AtomicInteger herbivores = new AtomicInteger(0);
    private final AtomicInteger plants = new AtomicInteger(0);
    private final Map<String, Integer> statistic = new ConcurrentHashMap<>();

    private final PrintIsland printIsland = new PrintIsland();

    public void calculate(Island island) {
        Cell[][] myIsland = island.getIsland();

        System.out.println(Arrays.deepToString(myIsland));
    }

}

package org.island.controllers;

import org.island.dto.AbstractIslandObject;
import org.island.dto.Island.Cell;
import org.island.dto.Island.Island;
import org.island.dto.animals.Animal;
import org.island.dto.animals.Carnivore;
import org.island.dto.animals.Herbivore;
import org.island.dto.plants.Plant;
import utils.PrintIsland;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

        statistic.put("Carnivores", carnivores.intValue());
        statistic.put("Herbivores", herbivores.intValue());
        statistic.put("Plants", plants.intValue());

        for (int i = 0; i < myIsland.length; i++) {
            for (int j = 0; j < myIsland[i].length; j++) {
                List<AbstractIslandObject> organisms = myIsland[i][j].getOrganisms();

                for (int k = 0; k < organisms.size(); k++) {
                    if (organisms.get(k) instanceof Carnivore) {
                        statistic.put("Carnivores", carnivores.incrementAndGet());
                    } else if (organisms.get(k) instanceof Herbivore) {
                        statistic.put("Herbivores", herbivores.incrementAndGet());
                    } else if (organisms.get(k) instanceof Plant) {
                        statistic.put("Plants", plants.incrementAndGet());
                    }
                }

            }
        }


        System.out.println(printIsland.printStatistic(statistic));
    }

}

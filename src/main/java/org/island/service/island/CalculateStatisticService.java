package org.island.service.island;


import org.island.model.AbstractIslandObject;
import org.island.model.island.Island;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.plants.Plant;

import java.util.HashMap;
import java.util.Map;

public class CalculateStatisticService {
    Island island = Island.getInstance();

    Map<String, Integer> statistic = new HashMap<>();

    PrintIslandService printIslandService = new PrintIslandService();

    public void calculateStatistic() {
        for (int i = 0; i < island.getIsland().size(); i++) {
            for (int j = 0; j < island.getIsland().get(i).size(); j++) {
                for (int k = 0; k < island.getIsland().get(i).get(j).getOrganisms().size(); k++) {
                    AbstractIslandObject organism = island.getIsland().get(i).get(j).getOrganisms().get(k);

                    if (organism instanceof Animal) {
                        if (statistic.containsKey(organism.getType())) {
                            statistic.put(organism.getType(), statistic.get(organism.getType()) + 1);
                            continue;
                        }

                        statistic.put(organism.getType(), 1);
                    }

                    if (organism instanceof Plant) {
                        if (statistic.containsKey(organism.getType())) {
                            statistic.put(organism.getType(), statistic.get(organism.getType()) + 1);
                            continue;
                        }

                        statistic.put(organism.getType(), 1);
                    }
                }
            }
        }

        printIslandService.printStatistic(statistic);
        statistic.clear();
    }
}

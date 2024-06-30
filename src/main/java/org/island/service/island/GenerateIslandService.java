package org.island.service.island;

import org.island.dto.island.IslandConfig;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.service.serialization.ReadJsonService;
import org.island.service.utils.RandomService;

import java.util.concurrent.CopyOnWriteArrayList;

public class GenerateIslandService {

    ReadJsonService readJsonService = new ReadJsonService();
    RandomService randomService = new RandomService();

    public Island generateIsland() {
        IslandConfig islandConfig = readJsonService.readJson("src/main/resources/config.json", IslandConfig.class);

        Island newIsland = Island.getInstance();

        for (int i = 0; i < islandConfig.getX(); i++) {
            newIsland.getIsland().add(new CopyOnWriteArrayList<>());
            for (int j = 0; j < islandConfig.getY(); j++) {
                newIsland.getIsland().get(i).add(new Cell(i, j));
            }
            System.out.println(newIsland.getIsland().get(i));
        }

        return newIsland;
    }
}

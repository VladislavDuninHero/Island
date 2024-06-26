package org.island.service.island;

import org.island.dto.IslandConfig;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.service.serialization.ReadJsonService;

import java.util.concurrent.CopyOnWriteArrayList;

public class GenerateIslandService {

    ReadJsonService readJsonService = new ReadJsonService();

    public Island generateIsland() {
        IslandConfig islandConfig = readJsonService.readJson("src/main/resources/config.json", IslandConfig.class);

        Island newIsland = new Island();

        for (int i = 0; i < islandConfig.getX(); i++) {
            for (int j = 0; j < islandConfig.getY(); j++) {
                newIsland.getIsland().add(new CopyOnWriteArrayList<>());
            }
        }

        for (int i = 0; i < newIsland.getIsland().size(); i++) {
            for (int j = 0; j < newIsland.getIsland().get(i).size(); j++) {
                newIsland.getIsland().get(j).add(new Cell(i, j));
            }
        }

        System.out.println(newIsland);

        return newIsland;
    }
}

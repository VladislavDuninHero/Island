package org.island.service.island;

import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.service.utils.RandomService;

import java.util.List;

public class FillIslandService {

    RandomService randomService = new RandomService();

    public void fillIsland(Island island) {
        for (List<Cell> field : island.getIsland()) {
            System.out.println(field);
        }
    }
}

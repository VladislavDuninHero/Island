package org.island.service.animals.moving;

import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.model.organisms.animals.Animal;
import org.island.service.utils.RandomService;

import java.util.List;

public class MovingService {

    Island island = Island.getInstance();

    RandomService randomService = new RandomService();

    public void move(Animal animal, Cell cell, List<Cell> row) {

        int randomStep = randomService.random(0, row.size());
        int randomRow = randomService.random(0, island.getIsland().size());

        List<AbstractIslandObject> organismsInCurrentCell = cell.getOrganisms();
        List<Cell> newRow = island.getIsland().get(randomRow);
        List<AbstractIslandObject> organismsInRandomStepCell = newRow.get(randomStep).getOrganisms();

        organismsInCurrentCell.remove(animal);
        organismsInRandomStepCell.add(animal);
    }
}

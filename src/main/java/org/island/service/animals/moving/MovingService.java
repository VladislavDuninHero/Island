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
        //1. Берется животное из текущей клетки
        //2. Вычисляется новая клетка
        //3. Животное удаляется из текущей клетки и перемещается в другую клетку на n-рандом шагов
        int randomStep = randomService.random(0, row.size());
        List<AbstractIslandObject> organismsInCurrentCell = cell.getOrganisms();
        List<AbstractIslandObject> organismsInRandomStepCell = row.get(randomStep).getOrganisms();

        organismsInCurrentCell.remove(animal);
        organismsInRandomStepCell.add(animal);
    }
}

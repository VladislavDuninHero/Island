package org.island.service.animals.feeding;

import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.animals.Herbivore;
import org.island.model.organisms.plants.Plant;

public class FindOrganismForEatService {

    public Animal findAnimalForEat(Cell cell) {
        for (AbstractIslandObject organism : cell.getOrganisms()) {
            if (organism instanceof Herbivore animal) {
                return animal;
            }
        }

        return null;
    }

    public Plant findPlantForEat(Cell cell) {
        for (AbstractIslandObject organism : cell.getOrganisms()) {
            if (organism instanceof Plant plant) {
                return plant;
            }
        }

        return null;
    }
}

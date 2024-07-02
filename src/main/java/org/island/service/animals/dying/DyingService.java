package org.island.service.animals.dying;

import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;

public class DyingService {
    public void animalDye(Animal animal, Cell cell, boolean isFeeding) {
        if (isFeeding) {
            return;
        }

        cell.getOrganisms().remove(animal);
    }
}

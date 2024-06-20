package org.island.controllers.animalsServices;

import org.island.dto.AbstractIslandObject;
import org.island.dto.animals.Animal;

import java.util.List;

public class ContainsAnimalService {
    public boolean cellContainsAnimal(List<AbstractIslandObject> organisms) {
        boolean isContains = false;

        for (AbstractIslandObject organism : organisms) {
            if (organism instanceof Animal) {
                isContains = true;
                break;
            }
        }

        return isContains;
    }
}

package org.island.controllers.animalsServices;

import org.island.models.AbstractIslandObject;
import org.island.models.animals.Animal;

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

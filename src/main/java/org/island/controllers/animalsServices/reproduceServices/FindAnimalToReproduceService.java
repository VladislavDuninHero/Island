package org.island.controllers.animalsServices.reproduceServices;

import org.island.controllers.animalsServices.ContainsAnimalService;
import org.island.dto.AbstractIslandObject;
import org.island.dto.animals.Animal;

import java.util.List;

public class FindAnimalToReproduceService {

    ContainsAnimalService containsAnimalService = new ContainsAnimalService();

    public boolean findAnimalToReproduce(List<AbstractIslandObject> organisms, Animal animal) {
        if (!containsAnimalService.cellContainsAnimal(organisms)) {
            return false;
        }

        boolean isOneBreedAnimal = false;
        for (AbstractIslandObject organism : organisms) {
            if (organism.getType().equals(animal.getType())) {
                isOneBreedAnimal = true;
                break;
            }
        }

        return isOneBreedAnimal;
    }
}

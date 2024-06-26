package org.island2.controllers.animalsServices.feedingServices;

import org.island2.controllers.GenerateRandomService;
import org.island2.controllers.animalsServices.ContainsAnimalService;
import org.island2.models.AbstractIslandObject;
import org.island2.models.animals.Animal;

import java.util.List;

public class FindEateableService {

    GenerateRandomService generateRandomService = new GenerateRandomService();
    ContainsAnimalService containsAnimalService = new ContainsAnimalService();

    public Animal findToEating(List<AbstractIslandObject> organisms) {
        Animal animal = null;
        //todo доделать сервис поиска съедобного животного

        if (!containsAnimalService.cellContainsAnimal(organisms)) {
            return null;
        }

        boolean isAnimal = false;
        while (!isAnimal) {
            int randomOrganism = generateRandomService.random(0, organisms.size());
            AbstractIslandObject potentialAnimal = organisms.get(randomOrganism);
            if (potentialAnimal instanceof Animal) {
                isAnimal = true;
                animal = (Animal) potentialAnimal;
                break;
            }
        }

        return animal;
    }
}

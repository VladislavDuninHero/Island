package org.island.controllers.animalsServices.feedingServices;

import org.island.controllers.SerializationJsonService;
import org.island.dto.AbstractIslandObject;
import org.island.dto.animals.Animal;
import org.island.dto.config.AnimalConfig;

import java.io.File;
import java.util.List;

public class FeedService {

    SerializationJsonService serializationJsonService = new SerializationJsonService();

    public boolean feed(Animal animal, Animal eatingAnimal) {
        boolean isAnimalFeeding = false;

        AnimalConfig animalConfig = serializationJsonService.parseOrganismJson(new File(animal.getConfigPath()));

        System.out.println(animalConfig);

//        chanceOfEat = animal.getChanceConfig().get(eatingAnimal.getType());
//        int random = random.nextInt(0, 100);
//
//        if (random >= chanceOfEat) {
//            animal.setSaturationOfEat(eatingAnimal.getSaturationOfEat());
//            isAnimalFeeding = true;
//        }

        return isAnimalFeeding;
    }
}

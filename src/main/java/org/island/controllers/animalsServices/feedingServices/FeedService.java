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

        int chanceOfEat = switch (eatingAnimal.getType()) {
            case "bear" -> animalConfig.getChanceOfEating().getBear();
            case "wolf" -> animalConfig.getChanceOfEating().getWolf();
            case "eagle" -> animalConfig.getChanceOfEating().getEagle();
            case "self" -> animalConfig.getChanceOfEating().getSelf();
            case "lion" -> animalConfig.getChanceOfEating().getLion();
            case "buffalo" -> animalConfig.getChanceOfEating().getBuffalo();
            case "caterpillar" -> animalConfig.getChanceOfEating().getCaterpillar();
            case "hog" -> animalConfig.getChanceOfEating().getHog();
            case "mouse" -> animalConfig.getChanceOfEating().getMouse();
            case "rabbit" -> animalConfig.getChanceOfEating().getRabbit();
            case "sheep" -> animalConfig.getChanceOfEating().getSheep();
            default -> throw new IllegalArgumentException();
        };

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

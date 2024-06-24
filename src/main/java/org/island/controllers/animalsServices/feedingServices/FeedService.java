package org.island.controllers.animalsServices.feedingServices;

import org.island.controllers.GenerateRandomService;
import org.island.controllers.SerializationJsonService;
import org.island.dto.AbstractIslandObject;
import org.island.dto.animals.Animal;
import org.island.dto.config.AnimalConfig;

import java.io.File;
import java.util.List;

public class FeedService {

    SerializationJsonService serializationJsonService = new SerializationJsonService();
    GenerateRandomService generateRandomService = new GenerateRandomService();

    //todo попробовать исправить dto на map
    //todo доделать съедение животного в зависимости от насыщения
    public boolean feed(Animal animal, Animal eatingAnimal) {
        boolean isAnimalFeeding = false;

        AnimalConfig animalConfig = serializationJsonService.parseOrganismJson(new File(animal.getConfigPath()));
        AnimalConfig eatingAnimalConfig = serializationJsonService.parseOrganismJson(new File(eatingAnimal.getConfigPath()));

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

        System.out.println(chanceOfEat);

        int randomChanceForAnimal = generateRandomService.random(0, 100);

        if (randomChanceForAnimal >= chanceOfEat) {
            animal.setSaturationOfEat(animal.getSaturationOfEat() + eatingAnimalConfig.getSaturationOfEat());
            isAnimalFeeding = true;
        }

        return isAnimalFeeding;
    }
}

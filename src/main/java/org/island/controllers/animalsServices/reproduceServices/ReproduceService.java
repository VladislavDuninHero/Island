package org.island.controllers.animalsServices.reproduceServices;

import org.island.controllers.GenerateRandomService;
import org.island.dto.AbstractIslandObject;
import org.island.dto.Island.Cell;
import org.island.dto.animals.Animal;
import org.island.factory.AnimalsFactory;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ReproduceService {

    private final int chanceOfReproduce = 50;
    private final GenerateRandomService generateRandomService = new GenerateRandomService();

    private final AnimalsFactory animalsFactory = new AnimalsFactory();

    private final FindAnimalToReproduceService findAnimalToReproduceService = new FindAnimalToReproduceService();
    public void reproduce(List<AbstractIslandObject> organisms, AbstractIslandObject animal) {
        int randomReproduce = generateRandomService.random(0, 100);
        boolean findAnimalToReproduce = findAnimalToReproduceService.findAnimalToReproduce(organisms, (Animal) animal);

        if (findAnimalToReproduce && randomReproduce >= chanceOfReproduce) {
            int id = 0;

            for (Integer animalInFactory : animalsFactory.getAnimals().keySet()) {
                if (animalsFactory.getAnimals().get(animalInFactory).get().getType().equals(animal.getType())) {
                    id = animalInFactory;
                }
            }

            Animal bornAnimal = animalsFactory.createAnimal(id);
            organisms.add(bornAnimal);
        }
    }
}

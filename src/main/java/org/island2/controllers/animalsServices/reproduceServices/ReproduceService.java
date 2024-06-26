package org.island2.controllers.animalsServices.reproduceServices;

import org.island2.controllers.GenerateRandomService;
import org.island2.models.AbstractIslandObject;
import org.island2.models.animals.Animal;
import org.island2.factory.AnimalsFactory;

import java.util.List;

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

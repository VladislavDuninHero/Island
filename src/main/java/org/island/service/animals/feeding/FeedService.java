package org.island.service.animals.feeding;

import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.animals.Carnivore;
import org.island.model.organisms.animals.Herbivore;
import org.island.model.organisms.plants.Plant;
import org.island.service.serialization.ReadJsonService;
import org.island.service.utils.RandomService;

import java.util.Map;

public class FeedService {

    FindOrganismForEatService findOrganismForEatService = new FindOrganismForEatService();
    ReadJsonService readJsonService = new ReadJsonService();

    RandomService randomService = new RandomService();
    public boolean feed(Animal animal, Cell cell) {
        if (animal instanceof Carnivore) {
            Animal eatingAnimal = findOrganismForEatService.findAnimalForEat(cell);

            int randomChance = randomService.random(0, 100);

            Map<String, Object> chancesOfEating = readJsonService.readJsonTreeToMap(animal.getConfig(), "chancesOfEating");

            if (eatingAnimal != null) {
                int chanceOfBeingEaten = (Integer) chancesOfEating.get(eatingAnimal.getType());

                if (chanceOfBeingEaten >= randomChance) {
                    cell.getOrganisms().remove(eatingAnimal);

                    return true;
                }

                return false;
            }
        }

        if (animal instanceof Herbivore) {
            Plant eatingPlant = findOrganismForEatService.findPlantForEat(cell);

            if (eatingPlant != null) {
                cell.getOrganisms().remove(eatingPlant);

                return true;
            }
        }

        return false;
    }
}

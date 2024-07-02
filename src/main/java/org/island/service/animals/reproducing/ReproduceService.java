package org.island.service.animals.reproducing;

import org.island.dto.organism.OrganismConfig;
import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.service.factory.OrganismFactory;
import org.island.service.serialization.ReadJsonService;
import org.island.service.utils.RandomService;

import java.util.List;

public class ReproduceService {

    OrganismFactory organismFactory = new OrganismFactory();
    RandomService randomService = new RandomService();

    ReadJsonService readJsonService = new ReadJsonService();

    public void reproduceAnimal(Animal animal, Cell cell) {
        int chanceOfCreateChild = randomService.random(0, 100);

        if (chanceOfCreateChild > 50) {

            List<AbstractIslandObject> organisms = cell.getOrganisms();

            Class<? extends Animal> clazz = animal.getClass();

            for (AbstractIslandObject organism : organisms) {
                if (clazz == organism.getClass()
                        && calculateAnimalCount(cell, (Animal) organism)
                        && !(organism.equals(animal))
                ) {
                    int organismId = organismFactory.getOrganismIdOnClassBased(clazz);
                    AbstractIslandObject childOfAnimal = organismFactory.createOrganism(organismId);

                    cell.getOrganisms().add(childOfAnimal);
                    break;
                }
            }
        }

    }

    private boolean calculateAnimalCount(Cell cell, Animal animal) {
        List<AbstractIslandObject> organisms = cell.getOrganisms();
        OrganismConfig organismConfig = readJsonService.readJson(animal.getConfig(), OrganismConfig.class);

        long countOfAnimal = organisms.stream().filter((el) -> el.getClass() == animal.getClass()).count();

        return countOfAnimal < organismConfig.getMaxCount();
    }

}

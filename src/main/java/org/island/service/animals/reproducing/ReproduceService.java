package org.island.service.animals.reproducing;

import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.animals.Wolf;
import org.island.service.factory.OrganismFactory;

import java.util.List;

public class ReproduceService {

    OrganismFactory organismFactory = new OrganismFactory();

    public void reproduceAnimal(Animal animal, Cell cell) {
        List<AbstractIslandObject> organisms = cell.getOrganisms();

        Class<? extends Animal> clazz = animal.getClass();



        for (AbstractIslandObject organism : organisms) {
            if (clazz == organism.getClass()) {
            }
        }
    }
}

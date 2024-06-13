package org.island.factory;

import org.island.dto.animals.Animal;
import org.island.dto.animals.carnivore.Bear;
import org.island.dto.animals.carnivore.Eagle;
import org.island.dto.animals.carnivore.Lion;
import org.island.dto.animals.carnivore.Wolf;
import org.island.dto.animals.herbivore.*;

import java.util.Map;
import java.util.function.Supplier;

public class AnimalsFactory {
    private final Map<Integer, Supplier<Animal>> animals = Map.ofEntries(
            Map.entry(1, Bear::new),
            Map.entry(2, Eagle::new),
            Map.entry(3, Lion::new),
            Map.entry(4, Wolf::new),
            Map.entry(5, Caterpillar::new),
            Map.entry(6, Hog::new),
            Map.entry(7, Mouse::new),
            Map.entry(8, Rabbit::new),
            Map.entry(9, Sheep::new),
            Map.entry(10, TheBuffalo::new)
    );

    public Animal createAnimal(int id) {
        if (!animals.containsKey(id)) {
            throw new IllegalArgumentException();
        }

        Supplier<Animal> animalSupplier = animals.get(id);

        return animalSupplier.get();
    }
}

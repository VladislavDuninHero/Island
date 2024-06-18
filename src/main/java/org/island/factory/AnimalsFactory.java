package org.island.factory;

import lombok.Getter;
import org.island.controllers.SerializationJsonService;
import org.island.dto.animals.Animal;
import org.island.dto.animals.carnivore.Bear;
import org.island.dto.animals.carnivore.Eagle;
import org.island.dto.animals.carnivore.Lion;
import org.island.dto.animals.carnivore.Wolf;
import org.island.dto.animals.herbivore.*;
import org.island.dto.config.AnimalConfig;
import org.island.exceptions.createAnimalException;

import java.io.File;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalsFactory {
    //todo судя по всему нужно переделать фабрики, тк они создают объект с заведомо известными полями по конфигам. Хотя конфиги нам дают данные именно о максимальных значениях.


    @Getter
    private final Map<Integer, Supplier<Animal>> animals = Map.ofEntries(
            Map.entry(1, Bear::new),
            Map.entry(2, Eagle::new),
            Map.entry(3, Lion::new),
            Map.entry(4, Wolf::new),
            Map.entry(5, Buffalo::new),
            Map.entry(6, Caterpillar::new),
            Map.entry(7, Hog::new),
            Map.entry(8, Mouse::new),
            Map.entry(9, Rabbit::new),
            Map.entry(10, Sheep::new)
    );

    public Animal createAnimal(int id) {
        if (!animals.containsKey(id)) {
            throw new createAnimalException("Animal is not defined");
        }

        Supplier<Animal> animalSupplier = animals.get(id);

        return animalSupplier.get();
    }


}

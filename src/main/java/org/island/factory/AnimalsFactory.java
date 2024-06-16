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

    SerializationJsonService serializationJsonService = new SerializationJsonService();

    //carnivore
    private final File BEAR = new File("src/main/resources/carnivoreAnimals/Bear.json");
    private final AnimalConfig BEAR_Animal_CONFIG = serializationJsonService.parseJson(BEAR);

    private final File EAGLE = new File("src/main/resources/carnivoreAnimals/Bear.json");
    private final AnimalConfig EAGLE_Animal_CONFIG = serializationJsonService.parseJson(EAGLE);

    private final File LION = new File("src/main/resources/carnivoreAnimals/Lion.json");
    private final AnimalConfig LION_Animal_CONFIG = new SerializationJsonService().parseJson(LION);

    private final File WOLF = new File("src/main/resources/carnivoreAnimals/Wolf.json");
    private final AnimalConfig WOLF_Animal_CONFIG = new SerializationJsonService().parseJson(WOLF);

    //herbivore
    private final File BUFFALO = new File("src/main/resources/herbivoreAnimals/Buffalo.json");
    private final AnimalConfig BUFFALO_Animal_CONFIG = new SerializationJsonService().parseJson(BUFFALO);

    private final File CATERPILLAR = new File("src/main/resources/herbivoreAnimals/Caterpillar.json");
    private final AnimalConfig CATERPILLAR_Animal_CONFIG = new SerializationJsonService().parseJson(CATERPILLAR);

    private final File HOG = new File("src/main/resources/herbivoreAnimals/Hog.json");
    private final AnimalConfig HOG_Animal_CONFIG = new SerializationJsonService().parseJson(HOG);

    private final File MOUSE = new File("src/main/resources/herbivoreAnimals/Mouse.json");
    private final AnimalConfig MOUSE_Animal_CONFIG = new SerializationJsonService().parseJson(MOUSE);

    private final File RABBIT = new File("src/main/resources/herbivoreAnimals/Rabbit.json");
    private final AnimalConfig RABBIT_Animal_CONFIG = new SerializationJsonService().parseJson(RABBIT);

    private final File SHEEP = new File("src/main/resources/herbivoreAnimals/Sheep.json");
    private final AnimalConfig SHEEP_Animal_CONFIG = new SerializationJsonService().parseJson(SHEEP);

    @Getter
    private final Map<Integer, Supplier<Animal>> animals = Map.ofEntries(
            Map.entry(1, () -> new Bear(BEAR_Animal_CONFIG.getWeight(), BEAR_Animal_CONFIG.getMaxCountInOneCell(), BEAR_Animal_CONFIG.getMaxCountCellInStep(), BEAR_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(2, () -> new Eagle(EAGLE_Animal_CONFIG.getWeight(), EAGLE_Animal_CONFIG.getMaxCountInOneCell(), EAGLE_Animal_CONFIG.getMaxCountCellInStep(), EAGLE_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(3, () -> new Lion(LION_Animal_CONFIG.getWeight(), LION_Animal_CONFIG.getMaxCountInOneCell(), LION_Animal_CONFIG.getMaxCountCellInStep(), LION_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(4, () -> new Wolf(WOLF_Animal_CONFIG.getWeight(), WOLF_Animal_CONFIG.getMaxCountInOneCell(), WOLF_Animal_CONFIG.getMaxCountCellInStep(), WOLF_Animal_CONFIG.getSaturationOfEat())),

            Map.entry(5, () -> new Buffalo(BUFFALO_Animal_CONFIG.getWeight(), BUFFALO_Animal_CONFIG.getMaxCountInOneCell(), BUFFALO_Animal_CONFIG.getMaxCountCellInStep(), BUFFALO_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(6, () -> new Caterpillar(CATERPILLAR_Animal_CONFIG.getWeight(), CATERPILLAR_Animal_CONFIG.getMaxCountInOneCell(), CATERPILLAR_Animal_CONFIG.getMaxCountCellInStep(), CATERPILLAR_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(7, () -> new Hog(HOG_Animal_CONFIG.getWeight(), HOG_Animal_CONFIG.getMaxCountInOneCell(), HOG_Animal_CONFIG.getMaxCountCellInStep(), HOG_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(8, () -> new Mouse(MOUSE_Animal_CONFIG.getWeight(), MOUSE_Animal_CONFIG.getMaxCountInOneCell(), MOUSE_Animal_CONFIG.getMaxCountCellInStep(), MOUSE_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(9, () -> new Rabbit(RABBIT_Animal_CONFIG.getWeight(), RABBIT_Animal_CONFIG.getMaxCountInOneCell(), RABBIT_Animal_CONFIG.getMaxCountCellInStep(), RABBIT_Animal_CONFIG.getSaturationOfEat())),
            Map.entry(10, () -> new Sheep(SHEEP_Animal_CONFIG.getWeight(), SHEEP_Animal_CONFIG.getMaxCountInOneCell(), SHEEP_Animal_CONFIG.getMaxCountCellInStep(), SHEEP_Animal_CONFIG.getSaturationOfEat()))
    );

    public Animal createAnimal(int id) {
        if (!animals.containsKey(id)) {
            throw new createAnimalException("Animal is not defined");
        }

        Supplier<Animal> animalSupplier = animals.get(id);

        return animalSupplier.get();
    }


}

package org.island.factory;

import lombok.Getter;
import org.island.controllers.SerializationJsonService;
import org.island.dto.animals.Animal;
import org.island.dto.animals.carnivore.Bear;
import org.island.dto.animals.carnivore.Eagle;
import org.island.dto.animals.carnivore.Lion;
import org.island.dto.animals.carnivore.Wolf;
import org.island.dto.animals.herbivore.*;
import org.island.dto.config.Config;
import org.island.exceptions.createAnimalException;

import java.io.File;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalsFactory {

    SerializationJsonService serializationJsonService = new SerializationJsonService();

    //carnivore
    private final File BEAR = new File("src/main/resources/carnivoreAnimals/Bear.json");
    private final Config BEAR_CONFIG = serializationJsonService.parseJson(BEAR);

    private final File EAGLE = new File("src/main/resources/carnivoreAnimals/Bear.json");
    private final Config EAGLE_CONFIG = serializationJsonService.parseJson(EAGLE);

    private final File LION = new File("src/main/resources/carnivoreAnimals/Lion.json");
    private final Config LION_CONFIG = new SerializationJsonService().parseJson(LION);

    private final File WOLF = new File("src/main/resources/carnivoreAnimals/Wolf.json");
    private final Config WOLF_CONFIG = new SerializationJsonService().parseJson(WOLF);

    //herbivore
    private final File BUFFALO = new File("src/main/resources/herbivoreAnimals/Buffalo.json");
    private final Config BUFFALO_CONFIG = new SerializationJsonService().parseJson(BUFFALO);

    private final File CATERPILLAR = new File("src/main/resources/herbivoreAnimals/Caterpillar.json");
    private final Config CATERPILLAR_CONFIG = new SerializationJsonService().parseJson(CATERPILLAR);

    private final File HOG = new File("src/main/resources/herbivoreAnimals/Hog.json");
    private final Config HOG_CONFIG = new SerializationJsonService().parseJson(HOG);

    private final File MOUSE = new File("src/main/resources/herbivoreAnimals/Mouse.json");
    private final Config MOUSE_CONFIG = new SerializationJsonService().parseJson(MOUSE);

    private final File RABBIT = new File("src/main/resources/herbivoreAnimals/Rabbit.json");
    private final Config RABBIT_CONFIG = new SerializationJsonService().parseJson(RABBIT);

    private final File SHEEP = new File("src/main/resources/herbivoreAnimals/Sheep.json");
    private final Config SHEEP_CONFIG = new SerializationJsonService().parseJson(SHEEP);

    @Getter
    private final Map<Integer, Supplier<Animal>> animals = Map.ofEntries(
            Map.entry(1, () -> new Bear(BEAR_CONFIG.getWeight(), BEAR_CONFIG.getMaxCountInOneCell(), BEAR_CONFIG.getMaxCountCellInStep(), BEAR_CONFIG.getSaturationOfEat())),
            Map.entry(2, () -> new Eagle(EAGLE_CONFIG.getWeight(), EAGLE_CONFIG.getMaxCountInOneCell(), EAGLE_CONFIG.getMaxCountCellInStep(), EAGLE_CONFIG.getSaturationOfEat())),
            Map.entry(3, () -> new Lion(LION_CONFIG.getWeight(), LION_CONFIG.getMaxCountInOneCell(), LION_CONFIG.getMaxCountCellInStep(), LION_CONFIG.getSaturationOfEat())),
            Map.entry(4, () -> new Wolf(WOLF_CONFIG.getWeight(), WOLF_CONFIG.getMaxCountInOneCell(), WOLF_CONFIG.getMaxCountCellInStep(), WOLF_CONFIG.getSaturationOfEat())),

            Map.entry(5, () -> new Buffalo(BUFFALO_CONFIG.getWeight(), BUFFALO_CONFIG.getMaxCountInOneCell(), BUFFALO_CONFIG.getMaxCountCellInStep(), BUFFALO_CONFIG.getSaturationOfEat())),
            Map.entry(6, () -> new Caterpillar(CATERPILLAR_CONFIG.getWeight(), CATERPILLAR_CONFIG.getMaxCountInOneCell(), CATERPILLAR_CONFIG.getMaxCountCellInStep(), CATERPILLAR_CONFIG.getSaturationOfEat())),
            Map.entry(7, () -> new Hog(HOG_CONFIG.getWeight(), HOG_CONFIG.getMaxCountInOneCell(), HOG_CONFIG.getMaxCountCellInStep(), HOG_CONFIG.getSaturationOfEat())),
            Map.entry(8, () -> new Mouse(MOUSE_CONFIG.getWeight(), MOUSE_CONFIG.getMaxCountInOneCell(), MOUSE_CONFIG.getMaxCountCellInStep(), MOUSE_CONFIG.getSaturationOfEat())),
            Map.entry(9, () -> new Rabbit(RABBIT_CONFIG.getWeight(), RABBIT_CONFIG.getMaxCountInOneCell(), RABBIT_CONFIG.getMaxCountCellInStep(), RABBIT_CONFIG.getSaturationOfEat())),
            Map.entry(10, () -> new Sheep(SHEEP_CONFIG.getWeight(), SHEEP_CONFIG.getMaxCountInOneCell(), SHEEP_CONFIG.getMaxCountCellInStep(), SHEEP_CONFIG.getSaturationOfEat()))
    );

    public Animal createAnimal(int id) {
        if (!animals.containsKey(id)) {
            throw new createAnimalException("Animal is not defined");
        }

        Supplier<Animal> animalSupplier = animals.get(id);

        return animalSupplier.get();
    }


}

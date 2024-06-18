package org.island.controllers;

import lombok.Getter;
import org.island.dto.config.AnimalConfig;

import java.io.File;


public class GetConfigsService {
    private final SerializationJsonService serializationJsonService = new SerializationJsonService();

    private final File BEAR = new File("src/main/resources/carnivoreAnimals/Bear.json");
    @Getter
    private final AnimalConfig BEAR_CONFIG = serializationJsonService.parseAnimalJson(BEAR);

    private final File EAGLE = new File("src/main/resources/carnivoreAnimals/Eagle.json");
    @Getter
    private final AnimalConfig EAGLE_CONFIG = serializationJsonService.parseAnimalJson(EAGLE);

    private final File LION = new File("src/main/resources/carnivoreAnimals/Lion.json");
    @Getter
    private final AnimalConfig LION_CONFIG = serializationJsonService.parseAnimalJson(LION);

    private final File WOLF = new File("src/main/resources/carnivoreAnimals/Wolf.json");
    @Getter
    private final AnimalConfig WOLF_CONFIG = serializationJsonService.parseAnimalJson(WOLF);

    //herbivore
    private final File BUFFALO = new File("src/main/resources/herbivoreAnimals/Buffalo.json");
    @Getter
    private final AnimalConfig BUFFALO_CONFIG = serializationJsonService.parseAnimalJson(BUFFALO);

    private final File CATERPILLAR = new File("src/main/resources/herbivoreAnimals/Caterpillar.json");
    @Getter
    private final AnimalConfig CATERPILLAR_CONFIG = serializationJsonService.parseAnimalJson(CATERPILLAR);

    private final File HOG = new File("src/main/resources/herbivoreAnimals/Hog.json");
    @Getter
    private final AnimalConfig HOG_CONFIG = serializationJsonService.parseAnimalJson(HOG);

    private final File MOUSE = new File("src/main/resources/herbivoreAnimals/Mouse.json");
    @Getter
    private final AnimalConfig MOUSE_CONFIG = serializationJsonService.parseAnimalJson(MOUSE);

    private final File RABBIT = new File("src/main/resources/herbivoreAnimals/Rabbit.json");
    @Getter
    private final AnimalConfig RABBIT_CONFIG = serializationJsonService.parseAnimalJson(RABBIT);

    private final File SHEEP = new File("src/main/resources/herbivoreAnimals/Sheep.json");
    @Getter
    private final AnimalConfig SHEEP_CONFIG = serializationJsonService.parseAnimalJson(SHEEP);
}

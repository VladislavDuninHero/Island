package org.island.controllers;

import lombok.Getter;
import org.island.dto.config.AnimalConfig;

import java.io.File;


public class GetConfigsService {
    private final SerializationJsonService serializationJsonService = new SerializationJsonService();

    private final File BEAR = new File("src/main/resources/carnivoreAnimals/Bear.json");
    @Getter
    private final AnimalConfig bearConfig = serializationJsonService.parseOrganismJson(BEAR);

    private final File EAGLE = new File("src/main/resources/carnivoreAnimals/Eagle.json");
    @Getter
    private final AnimalConfig EAGLE_CONFIG = serializationJsonService.parseOrganismJson(EAGLE);

    private final File LION = new File("src/main/resources/carnivoreAnimals/Lion.json");
    @Getter
    private final AnimalConfig LION_CONFIG = serializationJsonService.parseOrganismJson(LION);

    private final File WOLF = new File("src/main/resources/carnivoreAnimals/Wolf.json");
    @Getter
    private final AnimalConfig WOLF_CONFIG = serializationJsonService.parseOrganismJson(WOLF);

    //herbivore
    private final File BUFFALO = new File("src/main/resources/herbivoreAnimals/Buffalo.json");
    @Getter
    private final AnimalConfig BUFFALO_CONFIG = serializationJsonService.parseOrganismJson(BUFFALO);

    private final File CATERPILLAR = new File("src/main/resources/herbivoreAnimals/Caterpillar.json");
    @Getter
    private final AnimalConfig CATERPILLAR_CONFIG = serializationJsonService.parseOrganismJson(CATERPILLAR);

    private final File HOG = new File("src/main/resources/herbivoreAnimals/Hog.json");
    @Getter
    private final AnimalConfig HOG_CONFIG = serializationJsonService.parseOrganismJson(HOG);

    private final File MOUSE = new File("src/main/resources/herbivoreAnimals/Mouse.json");
    @Getter
    private final AnimalConfig MOUSE_CONFIG = serializationJsonService.parseOrganismJson(MOUSE);

    private final File RABBIT = new File("src/main/resources/herbivoreAnimals/Rabbit.json");
    @Getter
    private final AnimalConfig RABBIT_CONFIG = serializationJsonService.parseOrganismJson(RABBIT);

    private final File SHEEP = new File("src/main/resources/herbivoreAnimals/Sheep.json");
    @Getter
    private final AnimalConfig SHEEP_CONFIG = serializationJsonService.parseOrganismJson(SHEEP);
}

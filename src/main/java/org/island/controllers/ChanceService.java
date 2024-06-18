package org.island.controllers;

import org.island.dto.animals.Animal;
import org.island.dto.animals.Carnivore;
import org.island.dto.config.ChanceConfig;

import java.io.File;

public class ChanceService {

    private final SerializationJsonService serializationJsonService = new SerializationJsonService();

    private final File CHANCES_CONFIG = new File("src/main/resources/Chances.json");
    private final ChanceConfig WOLF_CHANCES = serializationJsonService.parseChanceConfig(CHANCES_CONFIG);

    public int takeChance(Animal who, Animal whom) {

        return 0;
    }
}

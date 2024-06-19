package org.island.controllers;

import org.island.dto.animals.Animal;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ChanceService {

    private final SerializationJsonService serializationJsonService = new SerializationJsonService();

    private final File CHANCES_CONFIG = new File("src/main/resources/Chances.json");

    public int takeChance(Animal who, Animal whom) {


        return 0;
    }
}

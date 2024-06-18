package org.island.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.island.dto.config.AnimalConfig;
import org.island.dto.config.ChanceConfig;

import java.io.File;

public class SerializationJsonService {
    //todo добавить кастомный exception для ошибки парсинга конфигов
    public AnimalConfig parseAnimalJson(File json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            AnimalConfig animalConfig = objectMapper.readValue(json, AnimalConfig.class);

            return animalConfig;
        } catch (Exception err) {
            System.out.println(err.getMessage());
            err.printStackTrace();
        }

        return new AnimalConfig();
    }

    public ChanceConfig parseChanceConfig(File json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode chanceConfig = objectMapper.readTree(json);


        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        return null;
    }


}

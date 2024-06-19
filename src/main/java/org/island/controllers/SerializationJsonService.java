package org.island.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.island.dto.config.AnimalConfig;

import java.io.File;

public class SerializationJsonService {
    //todo добавить кастомный exception для ошибки парсинга конфигов
    public AnimalConfig parseOrganismJson(File json) {
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



}

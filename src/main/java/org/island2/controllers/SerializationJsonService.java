package org.island2.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.island2.dto.config.AnimalConfig;
import org.island2.dto.config.HerbConfig;

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

    public HerbConfig parseOrganismJson(File json, boolean isHerb) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            HerbConfig herbConfig = objectMapper.readValue(json, HerbConfig.class);

            return herbConfig;
        } catch (Exception err) {
            System.out.println(err.getMessage());
            err.printStackTrace();
        }

        return new HerbConfig();
    }

}

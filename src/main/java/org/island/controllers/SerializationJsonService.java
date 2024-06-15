package org.island.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.island.dto.config.Config;

import java.io.File;

public class SerializationJsonService {
    public Config parseJson(File json) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Config config = objectMapper.readValue(json, Config.class);

            return config;
        } catch (Exception err) {
            System.out.println(err.getMessage());
            err.printStackTrace();
        }

        return new Config();
    }


}

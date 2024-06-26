package org.island.service.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class ReadJsonService {
    //todo сделать кастомный эксепшн для ошибки прочитки json

    @SneakyThrows
    public <T> T readJson(String jsonFile, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(new File(jsonFile), clazz);
    }
}

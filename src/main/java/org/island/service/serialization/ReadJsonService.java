package org.island.service.serialization;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadJsonService {
    //todo сделать кастомный эксепшн для ошибки прочитки json

    @SneakyThrows
    public <T> T readJson(String jsonFile, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(new File(jsonFile), clazz);
    }

    public Map<String, Object> readJsonTreeToMap (String jsonFile, String field) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode jsonTree = objectMapper.readTree(new File(jsonFile));
            String jsonNode = jsonTree.get(field).toPrettyString();

            return objectMapper.readValue(jsonNode, new TypeReference<Map<String, Object>>() {});
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }

        return new HashMap<>();
    }
}

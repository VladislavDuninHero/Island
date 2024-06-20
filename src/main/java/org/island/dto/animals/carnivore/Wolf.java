package org.island.dto.animals.carnivore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Carnivore;
import org.island.dto.config.AnimalConfig;

import java.util.HashMap;
import java.util.Map;

@ToString
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wolf extends Carnivore {
    private final String type = "wolf";

    private final double weight = 50;

    private String configPath = "src/main/resources/carnivoreAnimals/Wolf.json";

}

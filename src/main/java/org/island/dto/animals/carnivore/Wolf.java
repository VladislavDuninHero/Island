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
public class Wolf extends Carnivore {
    private final String type = "wolf";

    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig WOLF_CONFIG = getConfigsService.getWOLF_CONFIG();

    private final double weight = WOLF_CONFIG.getWeight();
}

package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Buffalo extends Herbivore {
    private final String type = "buffalo";

    private String configPath = "src/main/resources/herbivoreAnimals/Buffalo.json";
}

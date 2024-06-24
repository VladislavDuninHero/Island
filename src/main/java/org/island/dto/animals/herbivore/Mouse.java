package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Mouse extends Herbivore {
    private final String type = "mouse";

    private String configPath = "src/main/resources/herbivoreAnimals/Mouse.json";
}

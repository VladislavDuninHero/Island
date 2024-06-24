package org.island.dto.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Carnivore;
import org.island.dto.config.AnimalConfig;

@ToString
@Getter
public class Lion extends Carnivore {
    private final String type = "lion";

    private String configPath = "src/main/resources/carnivoreAnimals/Lion.json";

}

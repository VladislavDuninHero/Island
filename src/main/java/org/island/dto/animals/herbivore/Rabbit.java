package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Rabbit extends Herbivore {

    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig RABBIT_CONFIG = getConfigsService.getRABBIT_CONFIG();

    private final double weight = RABBIT_CONFIG.getWeight();
}

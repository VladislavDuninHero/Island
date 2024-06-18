package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Buffalo extends Herbivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig BUFFALO_CONFIG = getConfigsService.getBUFFALO_CONFIG();

    private final double weight = BUFFALO_CONFIG.getWeight();
}

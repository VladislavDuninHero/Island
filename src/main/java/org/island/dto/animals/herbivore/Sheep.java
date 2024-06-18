package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Sheep extends Herbivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig SHEEP_CONFIG = getConfigsService.getSHEEP_CONFIG();

    private final double weight = SHEEP_CONFIG.getWeight();
}

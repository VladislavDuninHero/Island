package org.island.dto.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Carnivore;
import org.island.dto.config.AnimalConfig;

@ToString
@Getter
public class Eagle extends Carnivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig EAGLE_CONFIG = getConfigsService.getEAGLE_CONFIG();

    private final double weight = EAGLE_CONFIG.getWeight();
}
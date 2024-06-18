package org.island.dto.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Carnivore;
import org.island.dto.config.AnimalConfig;

@ToString
@Getter
public class Wolf extends Carnivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig WOLF_CONFIG = getConfigsService.getWOLF_CONFIG();

    private final double weight = WOLF_CONFIG.getWeight();
}

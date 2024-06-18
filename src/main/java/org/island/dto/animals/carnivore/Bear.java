package org.island.dto.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Carnivore;
import org.island.dto.config.AnimalConfig;

@ToString
@Getter
public class Bear extends Carnivore {
    private final GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig BEAR_CONFIG = getBEAR_CONFIG();

    private final double weight = BEAR_CONFIG.getWeight();
}

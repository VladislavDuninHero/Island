package org.island.dto.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Carnivore;
import org.island.dto.config.AnimalConfig;

@ToString
@Getter
public class Lion extends Carnivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig LION_CONFIG = getConfigsService.getLION_CONFIG();

    private final double weight = LION_CONFIG.getWeight();

}

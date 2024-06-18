package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Mouse extends Herbivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig MOUSE_CONFIG = getConfigsService.getMOUSE_CONFIG();

    private final double weight = MOUSE_CONFIG.getWeight();
}

package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Hog extends Herbivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig HOG_CONFIG = getConfigsService.getHOG_CONFIG();

    private final double weight = HOG_CONFIG.getWeight();
}

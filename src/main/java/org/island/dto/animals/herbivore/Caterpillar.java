package org.island.dto.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.controllers.GetConfigsService;
import org.island.dto.animals.Herbivore;
import org.island.dto.config.AnimalConfig;

@Getter
@ToString
public class Caterpillar extends Herbivore {
    GetConfigsService getConfigsService = new GetConfigsService();

    private final AnimalConfig CATERPILLAR_CONFIG = getConfigsService.getCATERPILLAR_CONFIG();

    private final double weight = CATERPILLAR_CONFIG.getWeight();
}

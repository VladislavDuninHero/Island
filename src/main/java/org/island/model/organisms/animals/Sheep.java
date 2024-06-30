package org.island.model.organisms.animals;

import lombok.Getter;
import org.island.dto.organism.OrganismConfig;

@Getter
public class Sheep extends Herbivore {
    private final String type = "sheep";
    private final String config = "src/main/resources/herbivoreAnimals/Sheep.json";
}

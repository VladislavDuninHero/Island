package org.island.model.organisms.animals;

import lombok.Getter;
import org.island.dto.organism.OrganismConfig;

public class Sheep extends Animal {
    private final String type = "sheep";
    private final String config = "src/main/resources/herbivoreAnimals/Sheep.json";
}

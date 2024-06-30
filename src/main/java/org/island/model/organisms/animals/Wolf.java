package org.island.model.organisms.animals;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Wolf extends Carnivore {
    private final String type = "wolf";
    private final String config = "src/main/resources/carnivoreAnimals/Wolf.json";
}

package org.island.models.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island.models.animals.Carnivore;

@ToString
@Getter
public class Bear extends Carnivore {
    private final String type = "bear";

    private String configPath = "src/main/resources/carnivoreAnimals/Bear.json";
}

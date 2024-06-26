package org.island2.models.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island2.models.animals.Carnivore;

@ToString
@Getter
public class Eagle extends Carnivore {
    private final String type = "eagle";

    private String configPath = "src/main/resources/carnivoreAnimals/Eagle.json";
}
package org.island2.models.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island2.models.animals.Carnivore;

@ToString
@Getter
public class Lion extends Carnivore {
    private final String type = "lion";

    private String configPath = "src/main/resources/carnivoreAnimals/Lion.json";

}
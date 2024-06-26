package org.island2.models.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island2.models.animals.Herbivore;

@Getter
@ToString
public class Buffalo extends Herbivore {
    private final String type = "buffalo";

    private String configPath = "src/main/resources/herbivoreAnimals/Buffalo.json";
}

package org.island2.models.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island2.models.animals.Herbivore;

@Getter
@ToString
public class Sheep extends Herbivore {
    private final String type = "sheep";

    private String configPath = "src/main/resources/herbivoreAnimals/Sheep.json";
}

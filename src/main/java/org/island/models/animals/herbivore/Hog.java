package org.island.models.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.models.animals.Herbivore;

@Getter
@ToString
public class Hog extends Herbivore {
    private final String type = "hog";

    private String configPath = "src/main/resources/herbivoreAnimals/Hog.json";
}

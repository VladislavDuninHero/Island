package org.island2.models.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island2.models.animals.Herbivore;

@Getter
@ToString
public class Hog extends Herbivore {
    private final String type = "hog";

    private String configPath = "src/main/resources/herbivoreAnimals/Hog.json";
}

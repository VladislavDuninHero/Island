package org.island.models.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.models.animals.Herbivore;

@Getter
@ToString
public class Mouse extends Herbivore {
    private final String type = "mouse";

    private String configPath = "src/main/resources/herbivoreAnimals/Mouse.json";
}

package org.island.models.animals.herbivore;

import lombok.Getter;
import lombok.ToString;
import org.island.models.animals.Herbivore;

@Getter
@ToString
public class Rabbit extends Herbivore {

    private final String type = "rabbit";

    private String configPath = "src/main/resources/herbivoreAnimals/Rabbit.json";
}

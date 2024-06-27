package org.island2.models.animals.carnivore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.ToString;
import org.island2.models.animals.Carnivore;

@ToString
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wolf extends Carnivore {
    private final String type = "wolf";

    private String configPath = "src/main/resources/carnivoreAnimals/Wolf.json";

}
package org.island.dto.animals.carnivore;

import lombok.Getter;
import lombok.ToString;
import org.island.dto.animals.Carnivore;

@ToString
@Getter
public class Bear extends Carnivore {
    private final String type = "bear";

    private final double weight = 500;
}

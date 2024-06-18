package org.island.dto.animals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.island.dto.AbstractIslandObject;

@Getter
@Setter
public abstract class Animal extends AbstractIslandObject {
    private double weight;
    private int maxCountInOneCell;
    private int maxCountCellInStep;
    private double saturationOfEat;
}

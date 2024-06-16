package org.island.dto.animals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.island.dto.AbstractIslandObject;

@AllArgsConstructor
@Getter
public abstract class Animal extends AbstractIslandObject {
    private final double weight;
    private final int maxCountInOneCell;
    private final int maxCountCellInStep;
    private final double saturationOfEat;
}

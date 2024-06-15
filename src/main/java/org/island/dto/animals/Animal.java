package org.island.dto.animals;

import lombok.AllArgsConstructor;
import org.island.dto.AbstractIslandObject;

@AllArgsConstructor
public abstract class Animal extends AbstractIslandObject {
    private final double weight;
    private final int maxCountInOneCell;
    private final int maxCountCellInStep;
    private final double saturationOfEat;
}

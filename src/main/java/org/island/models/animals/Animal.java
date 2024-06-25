package org.island.models.animals;

import lombok.Getter;
import lombok.Setter;
import org.island.models.AbstractIslandObject;

@Getter
@Setter
public abstract class Animal extends AbstractIslandObject {
    private double weight;
    private int maxCountInOneCell;
    private int maxCountCellInStep;
    private double saturationOfEat;
    private String type;
    private String configPath;
}

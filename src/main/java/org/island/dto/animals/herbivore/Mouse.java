package org.island.dto.animals.herbivore;

import org.island.dto.animals.Herbivore;

public class Mouse extends Herbivore {
    public Mouse(double weight, int maxCountInOneCell, int maxCountCellInStep, double saturationOfEat) {
        super(weight, maxCountInOneCell, maxCountCellInStep, saturationOfEat);
    }
}

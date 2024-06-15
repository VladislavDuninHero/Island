package org.island.dto.animals.herbivore;

import org.island.dto.animals.Herbivore;

public class Hog extends Herbivore {
    public Hog(double weight, int maxCountInOneCell, int maxCountCellInStep, double saturationOfEat) {
        super(weight, maxCountInOneCell, maxCountCellInStep, saturationOfEat);
    }
}

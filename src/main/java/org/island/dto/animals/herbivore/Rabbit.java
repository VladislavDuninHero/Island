package org.island.dto.animals.herbivore;

import org.island.dto.animals.Herbivore;

public class Rabbit extends Herbivore {
    public Rabbit(double weight, int maxCountInOneCell, int maxCountCellInStep, double saturationOfEat) {
        super(weight, maxCountInOneCell, maxCountCellInStep, saturationOfEat);
    }
}

package org.island.dto.animals.carnivore;

import lombok.ToString;
import org.island.dto.animals.Carnivore;

@ToString
public class Wolf extends Carnivore {
    public Wolf(double weight, int maxCountInOneCell, int maxCountCellInStep, double saturationOfEat) {
        super(weight, maxCountInOneCell, maxCountCellInStep, saturationOfEat);
    }
}

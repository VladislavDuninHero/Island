package org.island.dto.animals.carnivore;

import lombok.ToString;
import org.island.dto.animals.Carnivore;

@ToString
public class Bear extends Carnivore {
    public Bear(double weight, int maxCountInOneCell, int maxCountCellInStep, double saturationOfEat) {
        super(weight, maxCountInOneCell, maxCountCellInStep, saturationOfEat);
    }
}

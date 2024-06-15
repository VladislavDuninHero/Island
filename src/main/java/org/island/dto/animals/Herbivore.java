package org.island.dto.animals;

public abstract class Herbivore extends Animal {
    public Herbivore(double weight, int maxCountInOneCell, int maxCountCellInStep, double saturationOfEat) {
        super(weight, maxCountInOneCell, maxCountCellInStep, saturationOfEat);
    }
}

package org.island.dto.animals;

public abstract class Carnivore extends Animal {
    public Carnivore(double weight, int maxCountInOneCell, int maxCountCellInStep, double saturationOfEat) {
        super(weight, maxCountInOneCell, maxCountCellInStep, saturationOfEat);
    }
}

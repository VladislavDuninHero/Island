package org.island.model.organisms.animals;

import lombok.Getter;
import org.island.model.AbstractIslandObject;

@Getter
public abstract class Animal extends AbstractIslandObject {
    private double weight;
    private int maxSpeed;
    private int maxCount;
}

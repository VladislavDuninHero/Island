package org.island.model.organisms.plants;

import lombok.Getter;
import org.island.model.AbstractIslandObject;

@Getter
public abstract class Plant extends AbstractIslandObject {
    private double weight;
    private int maxCount;
}

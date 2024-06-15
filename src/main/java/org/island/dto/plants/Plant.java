package org.island.dto.plants;

import lombok.AllArgsConstructor;
import org.island.dto.AbstractIslandObject;

@AllArgsConstructor
public abstract class Plant extends AbstractIslandObject {
    private final double weight;
    private final int maxCountInOneCell;
}

package org.island.models.island;


import lombok.Getter;
import org.island.models.AbstractIslandObject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Getter
public class Cell {
    private final List<AbstractIslandObject> organisms;
    private final int x;
    private final int y;

    public Cell(int x, int y) {
        organisms = new CopyOnWriteArrayList<>();
        this.x = x;
        this.y = y;
    }
}

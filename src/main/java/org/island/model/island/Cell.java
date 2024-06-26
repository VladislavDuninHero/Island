package org.island.model.island;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.island.model.AbstractIslandObject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Getter
public class Cell {
    private final List<AbstractIslandObject> organisms = new CopyOnWriteArrayList<>();

    private final int x;
    private final int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

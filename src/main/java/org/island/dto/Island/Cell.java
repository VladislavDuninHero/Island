package org.island.dto.Island;


import org.island.dto.AbstractIslandObject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cell {
    private List<AbstractIslandObject> organisms;

    public Cell() {
        organisms = new CopyOnWriteArrayList<>();
    }
}

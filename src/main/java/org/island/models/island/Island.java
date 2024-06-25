package org.island.models.island;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Island {
    private final Cell[][] island;

    public Cell[][] getIsland() {
        return this.island;
    }
}

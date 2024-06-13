package org.island.dto.Island;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Island {
    private Cell[][] island;

    public Cell[][] getIsland() {
        return this.island;
    }
}

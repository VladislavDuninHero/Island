package org.island.controllers.islandServices;

import lombok.AllArgsConstructor;
import org.island.models.island.Cell;
import org.island.models.island.Island;

@AllArgsConstructor
public class GenerateIslandService {
    private final int SIDEX;
    private final int SIDEY;

    public Island generate() {
        Cell[][] generated = new Cell[SIDEX][SIDEY];

        Island island = new Island(generated);

        return island;
    }
}

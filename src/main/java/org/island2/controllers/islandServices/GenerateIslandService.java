package org.island2.controllers.islandServices;

import lombok.AllArgsConstructor;
import org.island2.models.island.Cell;
import org.island2.models.island.Island;

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

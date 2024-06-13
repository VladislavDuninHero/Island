package org.island;

import org.island.controllers.GenerateIslandService;
import org.island.dto.Island.Cell;
import org.island.dto.Island.Island;
import org.island.view.UserInterfaceRunner;

public class Application {
    UserInterfaceRunner userInterfaceRunner = new UserInterfaceRunner();
    GenerateIslandService generateIslandService = new GenerateIslandService(2, 2);

    public void start() {
        userInterfaceRunner.run();
        Island island = generateIslandService.generate();

        island.getIsland();
    }
}

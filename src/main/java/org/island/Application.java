package org.island;

import org.island.controllers.FillIslandService;
import org.island.controllers.GenerateIslandService;
import org.island.controllers.GenerateRandomService;
import org.island.dto.Island.Island;
import org.island.factory.AnimalsFactory;
import org.island.factory.PlantsFactory;
import org.island.view.UserInterfaceRunner;

import java.util.Arrays;

public class Application {
    UserInterfaceRunner userInterfaceRunner = new UserInterfaceRunner();
    GenerateIslandService generateIslandService = new GenerateIslandService(2, 2);
    FillIslandService fillIslandService = new FillIslandService(new AnimalsFactory(), new PlantsFactory(), new GenerateRandomService());

    public void start() {
        userInterfaceRunner.run();
        Island island = generateIslandService.generate();
        fillIslandService.fillIsland(island);
    }
}

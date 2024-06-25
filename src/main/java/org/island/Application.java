package org.island;

import org.island.controllers.*;
import org.island.controllers.islandServices.FillIslandService;
import org.island.controllers.islandServices.GenerateIslandService;
import org.island.models.island.Island;
import org.island.factory.AnimalsFactory;
import org.island.factory.PlantsFactory;
import org.island.view.UserInterfaceRunner;

public class Application {
    UserInterfaceRunner userInterfaceRunner = new UserInterfaceRunner();
    GenerateIslandService generateIslandService = new GenerateIslandService(2, 2);
    FillIslandService fillIslandService = new FillIslandService(
            new AnimalsFactory(),
            new PlantsFactory(),
            new GenerateRandomService()
    );
    SimulationService simulationService = new SimulationService();

    public void start() {
        userInterfaceRunner.run();

        Island island = generateIslandService.generate();

        fillIslandService.fillIsland(island);

        simulationService.runSimulation(island);

    }
}

package org.island2;

import org.island2.controllers.*;
import org.island2.controllers.islandServices.FillIslandService;
import org.island2.controllers.islandServices.GenerateIslandService;
import org.island2.models.island.Island;
import org.island2.factory.AnimalsFactory;
import org.island2.factory.PlantsFactory;
import org.island2.view.UserInterfaceRunner;

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

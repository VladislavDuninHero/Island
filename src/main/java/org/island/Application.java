package org.island;

import org.island.model.island.Island;
import org.island.service.island.FillIslandService;
import org.island.service.island.GenerateIslandService;
import org.island.view.UserInterface;

public class Application {
    UserInterface userInterface = new UserInterface();

    GenerateIslandService generateIslandService = new GenerateIslandService();

    FillIslandService fillIslandService = new FillIslandService();

    public void run() {
        //view
        userInterface.initiateView();

        //generate island
        Island island = generateIslandService.generateIsland();

        //fill island
        fillIslandService.fillIsland(island);
    }
}

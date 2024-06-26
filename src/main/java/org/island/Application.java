package org.island;

import org.island.service.island.GenerateIslandService;
import org.island.view.UserInterface;

public class Application {
    UserInterface userInterface = new UserInterface();

    GenerateIslandService generateIslandService = new GenerateIslandService();
    public void run() {
        //view
        userInterface.initiateView();

        //generate island
        generateIslandService.generateIsland();

        //
    }
}

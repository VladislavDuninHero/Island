package org.island;

import org.island.view.UserInterfaceRunner;

public class Application {
    UserInterfaceRunner userInterfaceRunner = new UserInterfaceRunner();

    public void start() {
        userInterfaceRunner.run();
    }
}

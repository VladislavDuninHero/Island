package org.island2.controllers;


import org.island2.models.actions.Actions;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class ActionService {

    List<Actions> actions = new CopyOnWriteArrayList<>(
            List.of(
                    Actions.MOVE,
                    Actions.EAT
            )
    );

    public Actions generateRandomAction() {
        int randomAction = new Random().nextInt(0, actions.size());

        Actions generatedAction = actions.get(randomAction);

        return generatedAction;
    }
}

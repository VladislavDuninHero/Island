package org.island.controllers;


import org.island.dto.Island.Island;
import org.island.dto.actions.Action;
import org.island.dto.actions.Actions;
import org.island.interfaces.Moveable;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class ActionService {

    List<Actions> actions = new CopyOnWriteArrayList<>(List.of(Actions.MOVE, Actions.EAT));

    public Actions generateRandomAction() {
        int randomAction = new Random().nextInt(0, actions.size());

        Actions generatedAction = actions.get(randomAction);

        return generatedAction;
    }
}

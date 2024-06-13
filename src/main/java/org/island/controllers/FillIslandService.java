package org.island.controllers;

import lombok.AllArgsConstructor;
import org.island.factory.AnimalsFactory;
import org.island.factory.PlantsFactory;

@AllArgsConstructor
public class FillIslandService {
    private final AnimalsFactory animalsFactory;
    private final PlantsFactory plantsFactory;

    public void fillIsland() {

    }
}

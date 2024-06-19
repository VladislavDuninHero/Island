package org.island;

import org.island.controllers.ChanceService;
import org.island.controllers.animalsServices.EatService;
import org.island.controllers.animalsServices.FeedService;
import org.island.dto.animals.carnivore.Lion;
import org.island.dto.animals.carnivore.Wolf;
import org.island.dto.animals.herbivore.Hog;

public class Main {
    public static void main(String[] args) {
        new Application().start();
    }
}
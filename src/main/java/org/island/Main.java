package org.island;

import org.island.controllers.animalsServices.FeedService;
import org.island.dto.animals.carnivore.Lion;

public class Main {
    public static void main(String[] args) {
        new Application().start();

        FeedService feedService = new FeedService();
        feedService.eat(new Lion());
    }
}
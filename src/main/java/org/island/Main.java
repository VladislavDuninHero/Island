package org.island;


import org.island.controllers.animalsServices.feedingServices.FeedService;
import org.island.dto.animals.carnivore.Wolf;
import org.island.dto.animals.herbivore.Hog;

public class Main {
    public static void main(String[] args) {
        new Application().start();
        FeedService feedService = new FeedService();
        feedService.feed(new Wolf(), new Hog());
    }
}
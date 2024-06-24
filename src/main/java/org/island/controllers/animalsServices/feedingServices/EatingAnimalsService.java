package org.island.controllers.animalsServices.feedingServices;

import org.island.controllers.GenerateRandomService;
import org.island.dto.AbstractIslandObject;
import org.island.dto.animals.Animal;

import java.util.List;

public class EatingAnimalsService {
    private GenerateRandomService generateRandomService = new GenerateRandomService();
    private FeedService feedService = new FeedService();
    private FindEateableService findEateableService = new FindEateableService();

    public void startFeeding(List<AbstractIslandObject> organisms, AbstractIslandObject who) {

        Animal animal = findEateableService.findToEating(organisms);

        if (animal == null) {
            return;
        }

        boolean resultOfEat = feedService.feed((Animal) who, animal);

        if (resultOfEat) {
            organisms.remove(animal);
        }

    }
}

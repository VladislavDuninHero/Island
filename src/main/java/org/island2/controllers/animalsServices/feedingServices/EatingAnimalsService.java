package org.island2.controllers.animalsServices.feedingServices;

import org.island2.controllers.GenerateRandomService;
import org.island2.models.AbstractIslandObject;
import org.island2.models.animals.Animal;

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

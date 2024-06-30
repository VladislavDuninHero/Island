package org.island.service.threadsService;

import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.model.organisms.animals.Animal;
import org.island.service.animals.feeding.FeedService;
import org.island.service.animals.moving.MovingService;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnimalLifeCycleService {

    MovingService movingService = new MovingService();
    FeedService feedService = new FeedService();
    Island island = Island.getInstance();

    public void runAnimalLifeCycle(ScheduledExecutorService executorService) {
        for (List<Cell> row : island.getIsland()) {
            Runnable runLifeCycle = () -> {
                for (Cell cell : row) {
                    List<AbstractIslandObject> listOfOrganisms = cell.getOrganisms();
                    for (AbstractIslandObject organism : listOfOrganisms) {
                        if (organism instanceof Animal animal) {
                            movingService.move(animal, cell, row);
                            feedService.feed(animal, cell);
                        }
                    }
                }
            };
            executorService.scheduleWithFixedDelay(runLifeCycle, 5, 15, TimeUnit.SECONDS);
        }
    }
}

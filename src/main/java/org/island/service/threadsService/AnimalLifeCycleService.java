package org.island.service.threadsService;

import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.model.organisms.animals.Animal;
import org.island.service.animals.dying.DyingService;
import org.island.service.animals.feeding.FeedService;
import org.island.service.animals.moving.MovingService;
import org.island.service.animals.reproducing.ReproduceService;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AnimalLifeCycleService {

    MovingService movingService = new MovingService();

    FeedService feedService = new FeedService();

    ReproduceService reproduceService = new ReproduceService();

    DyingService dyingService = new DyingService();

    Island island = Island.getInstance();

    public void runAnimalLifeCycle(ScheduledExecutorService executorService) {
        for (List<Cell> row : island.getIsland()) {
            Runnable runLifeCycle = () -> {
                for (Cell cell : row) {
                    List<AbstractIslandObject> listOfOrganisms = cell.getOrganisms();
                    for (AbstractIslandObject organism : listOfOrganisms) {
                        if (organism instanceof Animal animal) {
                            boolean isFeed = feedService.feed(animal, cell);
                            if (isFeed) {
                                reproduceService.reproduceAnimal(animal, cell);
                            }
                            movingService.move(animal, cell, row);
                            dyingService.animalDye(animal, cell, isFeed);
                        }
                    }
                }
            };
            executorService.scheduleWithFixedDelay(runLifeCycle, 5, 15, TimeUnit.SECONDS);
        }
    }
}

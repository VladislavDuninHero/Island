package org.island2.multithreading;

import lombok.AllArgsConstructor;
import org.island2.controllers.ActionService;
import org.island2.controllers.CalculateStatisticService;
import org.island2.controllers.animalsServices.reproduceServices.ReproduceService;
import org.island2.controllers.animalsServices.feedingServices.EatingAnimalsService;
import org.island2.controllers.animalsServices.movingServices.MovingService;
import org.island2.models.AbstractIslandObject;
import org.island2.models.island.Cell;
import org.island2.models.island.Coordinate;
import org.island2.models.island.Island;
import org.island2.models.actions.Actions;
import org.island2.models.animals.Animal;
import org.island2.models.plants.Plant;

//todo дописать реализацию "FeedService" для травоядных
@AllArgsConstructor
public class AnimalLifeCycle implements Runnable {
    private final Island island;

    @Override
    public void run() {
        Cell[][] myIsland = island.getIsland();

        MovingService movingService = new MovingService();
        EatingAnimalsService eatingAnimalsService = new EatingAnimalsService();
        ActionService actionService = new ActionService();
        ReproduceService reproduceService = new ReproduceService();

        for (int i = 0; i < myIsland.length; i++) {

            for (int j = 0; j < myIsland[i].length; j++) {
                for (int k = 0; k < myIsland[i][j].getOrganisms().size(); k++) {

                    AbstractIslandObject abstractIslandObject = myIsland[i][j].getOrganisms().get(k);

                    if (abstractIslandObject instanceof Animal) {
                        Actions action = actionService.generateRandomAction();

                        if (action == Actions.MOVE) {
                            movingService.move(
                                    island,
                                    (Animal) myIsland[i][j].getOrganisms().get(k),
                                    new Coordinate(i, j)
                            );
                        }

                        if (action == Actions.EAT) {
                            eatingAnimalsService.startFeeding(
                                    myIsland[i][j].getOrganisms(),
                                    myIsland[i][j].getOrganisms().get(k)
                            );
                        }

                        if (action == Actions.REPRODUCE) {
                            reproduceService.reproduce(
                                    myIsland[i][j].getOrganisms(),
                                    myIsland[i][j].getOrganisms().get(k)
                            );
                        }
                    }

                    if (abstractIslandObject instanceof Plant) {

                    }
                }
            }
        }

        CalculateStatisticService calculateStatisticService = new CalculateStatisticService();
        calculateStatisticService.calculate(island);
    }
}

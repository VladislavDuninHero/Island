package org.island2.controllers.islandServices;

import lombok.AllArgsConstructor;
import org.island2.controllers.GenerateRandomService;
import org.island2.models.island.Cell;
import org.island2.models.island.Island;
import org.island2.factory.AnimalsFactory;
import org.island2.factory.PlantsFactory;
import org.island2.utils.PrintIsland;


//todo реализовать заполнение острова
//todo реализовать заполнение острова по конфигу

@AllArgsConstructor
public class FillIslandService {
    private final AnimalsFactory animalsFactory;
    private final PlantsFactory plantsFactory;
    private final GenerateRandomService generateRandomService;
    private final PrintIsland printIsland = new PrintIsland();
    private final int INITIAL_LIMIT = 2;

    public void fillIsland(Island island) {
        Cell[][] myIsland = island.getIsland();


        for (int i = 0; i < myIsland.length; i++) {
            for (int j = 0; j < myIsland[i].length; j++) {
                myIsland[i][j] = new Cell(i, j);
            }
        }

        for (int i = 0; i < myIsland.length; i++) {
            for (int j = 0; j < INITIAL_LIMIT; j++) {
                int randomRow = generateRandomService.random(0, myIsland.length);
                int randomCell = generateRandomService.random(0, myIsland[i].length);
                int randomAnimal = generateRandomService.random(
                        1,
                        animalsFactory.getAnimals().size() > 1
                                ? animalsFactory.getAnimals().size()
                                : animalsFactory.getAnimals().size() + 1
                );

                myIsland[randomRow][randomCell].getOrganisms().add(animalsFactory.createAnimal(randomAnimal));
            }
        }

        for (int i = 0; i < myIsland.length; i++) {
            for (int j = 0; j < INITIAL_LIMIT; j++) {
                int randomRow = generateRandomService.random(0, myIsland.length);
                int randomCell = generateRandomService.random(0, myIsland[i].length);
                int randomPlant = generateRandomService.random(
                        1,
                        plantsFactory.getPlants().size() > 1
                                ? plantsFactory.getPlants().size()
                                : plantsFactory.getPlants().size() + 1
                );

                myIsland[randomRow][randomCell].getOrganisms().add(plantsFactory.createPlant(randomPlant));
            }
        }

    }
}

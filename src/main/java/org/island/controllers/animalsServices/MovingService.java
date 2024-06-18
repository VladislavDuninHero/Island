package org.island.controllers.animalsServices;

import org.island.controllers.GenerateRandomService;
import org.island.dto.Island.Cell;
import org.island.dto.Island.Coordinate;
import org.island.dto.Island.Island;
import org.island.dto.animals.Animal;

public class MovingService {

    GenerateRandomService generateRandomService = new GenerateRandomService();

    public void move(Island island, Animal animal, Coordinate oldCoordinate) {
        Cell[][] myIsland = island.getIsland();

        int randomMoveX = generateRandomService.random(0, myIsland.length);
        int randomMoveY = generateRandomService.random(0, myIsland[0].length);


        myIsland[randomMoveX][randomMoveY].getOrganisms().add(animal);
        myIsland[oldCoordinate.getX()][oldCoordinate.getY()].getOrganisms().remove(animal);
    }
}

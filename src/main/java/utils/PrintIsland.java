package utils;

import org.island.dto.Island.Cell;
import org.island.dto.Island.Island;

import java.util.Map;

public class PrintIsland {
    public void print(Island island) {
        Cell[][] myIsland = island.getIsland();
        for (int i = 0; i < myIsland.length; i++) {
            for (int j = 0; j < myIsland[i].length; j++) {
                System.out.println(myIsland[i][j]);
            }
        }
    }

    public void printOrganisms(Island island) {
        Cell[][] myIsland = island.getIsland();
        for (int i = 0; i < myIsland.length; i++) {
            for (int j = 0; j < myIsland[i].length; j++) {
                System.out.println(myIsland[i][j].getOrganisms());
            }
        }
    }

    public String printStatistic(Map<String, Integer> statistic) {

        return "CARNIVORE : " + statistic.get("Carnivores")
                + "\n" + "HERBIVORE : " + statistic.get("Herbivores")
                + "\n" + "PLANTS : " + statistic.get("Plants");

    }
}
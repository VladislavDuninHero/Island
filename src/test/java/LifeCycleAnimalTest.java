import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.animals.Sheep;
import org.island.model.organisms.animals.Wolf;
import org.island.model.organisms.plants.Herb;
import org.island.service.animals.feeding.FeedService;
import org.island.service.animals.moving.MovingService;
import org.island.service.animals.reproducing.ReproduceService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LifeCycleAnimalTest {

    FeedService feedService = new FeedService();
    MovingService movingService = new MovingService();
    ReproduceService reproduceService = new ReproduceService();

    List<Cell> row = new ArrayList<>(List.of(new Cell(0, 0), new Cell(0, 1)));

    @Test
    public void lifeCycleTest() {
        List<AbstractIslandObject> firstCellOrganisms = row.get(0).getOrganisms();
        List<AbstractIslandObject> secondCellOrganisms = row.get(1).getOrganisms();

        firstCellOrganisms.add(new Wolf());
        firstCellOrganisms.add(new Herb());
        firstCellOrganisms.add(new Herb());
        firstCellOrganisms.add(new Sheep());
        firstCellOrganisms.add(new Sheep());

        secondCellOrganisms.add(new Wolf());
        secondCellOrganisms.add(new Herb());
        secondCellOrganisms.add(new Herb());
        secondCellOrganisms.add(new Sheep());
        secondCellOrganisms.add(new Sheep());

        for (Cell cell : row) {
            for (AbstractIslandObject organism : cell.getOrganisms()) {
                if (organism instanceof Animal animal) {
                    feedService.feed(animal, cell);
                    reproduceService.reproduceAnimal(animal, cell);
                    movingService.move(animal, cell, row);
                }
            }
        }

    }
}

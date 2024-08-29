import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.island.Island;
import org.island.model.organisms.animals.Animal;
import org.island.service.animals.moving.MovingService;
import org.island.service.factory.OrganismFactory;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MoveAnimalsTests {

    List<Cell> firstRow = new CopyOnWriteArrayList<>(
            List.of(
                    new Cell(0, 0),
                    new Cell(0, 1),
                    new Cell(0, 2),
                    new Cell(0, 3),
                    new Cell(0, 4)
            )
    );
    List<Cell> secondRow = new CopyOnWriteArrayList<>(
            List.of(
                    new Cell(1, 0),
                    new Cell(1, 1),
                    new Cell(1, 2),
                    new Cell(1, 3),
                    new Cell(1, 4)
            )
    );

    Island island = Island.getInstance();

    OrganismFactory organismFactory = new OrganismFactory();

    MovingService movingService = new MovingService();

    @Test
    void moveAnimalsTest() {
        AbstractIslandObject organism = organismFactory.createOrganism(1);

        island.getIsland().add(firstRow);
        island.getIsland().add(secondRow);

        List<AbstractIslandObject> currentOrganisms = firstRow.get(0).getOrganisms();

        currentOrganisms.add(organism);

        movingService.move((Animal) currentOrganisms.get(0), firstRow.get(0), firstRow);

        assertFalse(currentOrganisms.contains(organism), "Current cell is not contains organism");

        boolean isContainsOrganism = false;

        for (List<Cell> row : island.getIsland()) {
            for (Cell cell : row) {
                for (AbstractIslandObject cellOrganism : cell.getOrganisms()) {
                    if (cellOrganism.equals(organism)) {
                        isContainsOrganism = true;
                        System.out.println("X: " + cell.getX() + ", " + "Y: " + cell.getY());
                    }
                }
            }
        }

        assertTrue(isContainsOrganism);
    }

}

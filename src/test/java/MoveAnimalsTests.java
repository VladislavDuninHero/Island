import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.service.animals.moving.MovingService;
import org.island.service.factory.OrganismFactory;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MoveAnimalsTests {

    List<Cell> row = new CopyOnWriteArrayList<>(
            List.of(
                    new Cell(0, 0),
                    new Cell(0, 1),
                    new Cell(0, 2),
                    new Cell(0, 3),
                    new Cell(0, 3)
            )
    );

    OrganismFactory organismFactory = new OrganismFactory();

    MovingService movingService = new MovingService();

    @Test
    void moveAnimalsTest() {
        AbstractIslandObject organism = organismFactory.createOrganism(1);

        List<AbstractIslandObject> currentOrganisms = row.get(0).getOrganisms();

        currentOrganisms.add(organism);

        movingService.move((Animal) currentOrganisms.get(0), row.get(0), row);

        assertFalse(currentOrganisms.contains(organism), "Current cell is not contains organism");

        boolean isContainsOrganism = false;

        for (Cell cell : row) {
            for (AbstractIslandObject cellOrganism : cell.getOrganisms()) {
                if (cellOrganism.equals(organism)) {
                    isContainsOrganism = true;
                }
            }
        }

        assertTrue(isContainsOrganism);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoveAnimalsTests that = (MoveAnimalsTests) o;
        return Objects.equals(row, that.row)
                && Objects.equals(organismFactory, that.organismFactory)
                && Objects.equals(movingService, that.movingService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, organismFactory, movingService);
    }
}

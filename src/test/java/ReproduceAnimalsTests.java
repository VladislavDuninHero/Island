import org.island.model.AbstractIslandObject;
import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.animals.Wolf;
import org.island.service.animals.reproducing.ReproduceService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReproduceAnimalsTests {

    ReproduceService reproduceService = new ReproduceService();
    Cell cell = new Cell(0, 0);

    @Test
    void reproduceAnimalTest() {
        cell.getOrganisms().add(new Wolf());
        cell.getOrganisms().add(new Wolf());

        int counter = 2;

        reproduceService.reproduceAnimal((Animal) cell.getOrganisms().get(0), cell);

        for (int i = 1; i < cell.getOrganisms().size(); i++) {
            if (cell.getOrganisms().get(i).getClass() == cell.getOrganisms().get(0).getClass()) {
                counter++;
            }
        }

        assertTrue(counter > 2);
    }
}

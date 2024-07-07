import org.island.model.island.Cell;
import org.island.model.organisms.animals.Animal;
import org.island.model.organisms.animals.Sheep;
import org.island.model.organisms.animals.Wolf;
import org.island.model.organisms.plants.Herb;
import org.island.model.organisms.plants.Plant;
import org.island.service.animals.feeding.FeedService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEatAnimals {
    FeedService feedService = new FeedService();

    Cell cell = new Cell(0, 0);
    Cell cellWithPlant = new Cell(0, 0);
    @Test
    void eatAnimal() {
        cell.getOrganisms().add(new Wolf());
        cell.getOrganisms().add(new Sheep());


        Animal animal = (Animal) cell.getOrganisms().get(0);
        Animal animalForEat = (Animal) cell.getOrganisms().get(1);

        boolean eating = feedService.feed(animal, cell);

        if (eating) {
            assertFalse(cell.getOrganisms().contains(animalForEat));
            return;
        }

        assertTrue(cell.getOrganisms().contains(animalForEat));
    }

    @Test
    void eatPlant() {
        cellWithPlant.getOrganisms().add(new Sheep());
        cellWithPlant.getOrganisms().add(new Herb());

        Animal animal = (Animal) cellWithPlant.getOrganisms().get(0);
        Plant plantForEat = (Plant) cellWithPlant.getOrganisms().get(1);

        boolean eating = feedService.feed(animal, cellWithPlant);

        if (eating) {
            assertFalse(cellWithPlant.getOrganisms().contains(plantForEat));
            return;
        }

        assertTrue(cellWithPlant.getOrganisms().contains(plantForEat));
    }
}

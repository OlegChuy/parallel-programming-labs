package ip91.oleh.chui.crossover.chromosomeController;

import ip91.oleh.chui.Individual;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BackpackChromosomeControllerTest {

    private final BackpackChromosomeController backpackChromosomeController = new BackpackChromosomeController();

    private Individual parent1;
    private Individual parent2;

    @BeforeEach
    void init() {
        Object[] parent1Chromosome = { true, true, false, true, false, true, true, false };
        Object[] parent2Chromosome = { false, true, true, false, false, false, false, true };

        parent1 = new Individual(parent1Chromosome);
        parent2 = new Individual(parent2Chromosome);
    }

    @Test
    void createUsingPointCrossoverShouldReturnCorrectChildren_1() {
        final int point = 1;

        Object[] expectedChromosome = { true, true, true, false, false, false, false, true };

        Object[] actualChromosome = backpackChromosomeController.createUsingPointCrossover(parent1, parent2, point);

        assertArrayEquals(expectedChromosome, actualChromosome);

        expectedChromosome = new Object[]{ false, true, false, true, false, true, true, false };

        actualChromosome = backpackChromosomeController.createUsingPointCrossover(parent2, parent1, point);

        assertArrayEquals(expectedChromosome, actualChromosome);
    }

    @Test
    void createUsingPointCrossoverShouldReturnCorrectChildren_2() {
        final int point = 7;

        Object[] expectedChromosome = { true, true, false, true, false, true, true, true };

        Object[] actualChromosome = backpackChromosomeController.createUsingPointCrossover(parent1, parent2, point);

        assertArrayEquals(expectedChromosome, actualChromosome);

        expectedChromosome = new Object[]{ false, true, true, false, false, false, false, false };

        actualChromosome = backpackChromosomeController.createUsingPointCrossover(parent2, parent1, point);

        assertArrayEquals(expectedChromosome, actualChromosome);
    }

    @Test
    void createUsingPointCrossoverShouldReturnCorrectChildren_3() {
        final int point = 3;

        Object[] expectedChromosome = { true, true, false, false, false, false, false, true };

        Object[] actualChromosome = backpackChromosomeController.createUsingPointCrossover(parent1, parent2, point);

        assertArrayEquals(expectedChromosome, actualChromosome);

        expectedChromosome = new Object[]{ false, true, true,true, false, true, true, false };

        actualChromosome = backpackChromosomeController.createUsingPointCrossover(parent2, parent1, point);

        assertArrayEquals(expectedChromosome, actualChromosome);
    }

}
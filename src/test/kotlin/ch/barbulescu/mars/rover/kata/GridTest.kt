package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GridTest {

    @Test
    fun `move rover north`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1)
        val movedRover = grid.move(rover, NORTH)

        assertThat(movedRover).isEqualTo(Rover(1, 0))
    }

    @Test
    fun `move rover east`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1)
        val movedRover = grid.move(rover, EAST)

        assertThat(movedRover).isEqualTo(Rover(2, 1))
    }

    @Test
    fun `move rover south`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1)
        val movedRover = grid.move(rover, SOUTH)

        assertThat(movedRover).isEqualTo(Rover(1, 2))
    }

    @Test
    fun `move rover west`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1)
        val movedRover = grid.move(rover, WEST)

        assertThat(movedRover).isEqualTo(Rover(0, 1))
    }
}

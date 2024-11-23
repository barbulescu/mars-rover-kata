package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GridTest {

    @Test
    fun `move rover north`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1, NORTH)
        val movedRover = grid.move(rover)

        assertThat(movedRover).isEqualTo(rover.copy(y = 0))
    }

    @Test
    fun `move rover east`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1, EAST)
        val movedRover = grid.move(rover)

        assertThat(movedRover).isEqualTo(rover.copy(x = 2))
    }

    @Test
    fun `move rover south`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1, SOUTH)
        val movedRover = grid.move(rover)

        assertThat(movedRover).isEqualTo(rover.copy(y = 2))
    }

    @Test
    fun `move rover west`() {
        val grid = Grid(5, 5)
        val rover = Rover(1, 1, WEST)
        val movedRover = grid.move(rover)

        assertThat(movedRover).isEqualTo(rover.copy(x = 0))
    }
}

package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverTest {

    @Test
    fun `move rover north`() {
        val rover = Rover(1, 1, NORTH)
        val movedRover = rover.move()

        assertThat(movedRover).isEqualTo(rover.copy(y = 0))
    }

    @Test
    fun `move rover east`() {
        val rover = Rover(1, 1, EAST)
        val movedRover = rover.move()

        assertThat(movedRover).isEqualTo(rover.copy(x = 2))
    }

    @Test
    fun `move rover south`() {
        val rover = Rover(1, 1, SOUTH)
        val movedRover = rover.move()

        assertThat(movedRover).isEqualTo(rover.copy(y = 2))
    }

    @Test
    fun `move rover west`() {
        val rover = Rover(1, 1, WEST)
        val movedRover = rover.move()

        assertThat(movedRover).isEqualTo(rover.copy(x = 0))
    }

}

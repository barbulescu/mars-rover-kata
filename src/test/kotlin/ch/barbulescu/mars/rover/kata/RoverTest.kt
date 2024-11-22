package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverTest {

    @Test
    fun `move rover north`() {
        val rover = Rover(1, 1)
        val movedRover = rover.move(NORTH)

        assertThat(movedRover).isEqualTo(Rover(1, 0))
    }

    @Test
    fun `move rover east`() {
        val rover = Rover(1, 1)
        val movedRover = rover.move(EAST)

        assertThat(movedRover).isEqualTo(Rover(2, 1))
    }

    @Test
    fun `move rover south`() {
        val rover = Rover(1, 1)
        val movedRover = rover.move(SOUTH)

        assertThat(movedRover).isEqualTo(Rover(1, 2))
    }

    @Test
    fun `move rover west`() {
        val rover = Rover(1, 1)
        val movedRover = rover.move(WEST)

        assertThat(movedRover).isEqualTo(Rover(0, 1))
    }

}

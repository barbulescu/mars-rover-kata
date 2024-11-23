package ch.barbulescu.mars.rover.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

class GridTest {
    private val grid = Grid(5, 5)

    @ParameterizedTest
    @ArgumentsSource(RoverMoveTestData::class)
    fun `test rover movement on free grid`(start: Rover, end: Rover) {
        val movedRover = grid.move(start)
        assertThat(movedRover).isEqualTo(end)
    }
}


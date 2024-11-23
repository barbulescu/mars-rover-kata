package ch.barbulescu.mars.rover.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

class RoverTest {

    @ParameterizedTest
    @ArgumentsSource(RoverMoveTestData::class)
    fun `test rover movement`(start: Rover, end: Rover) {
        val movedRover = start.move()
        assertThat(movedRover).isEqualTo(end)
    }

    @ParameterizedTest
    @ArgumentsSource(RoverRotateTestData::class)
    fun `test rover rotate`(start: Rover, end: Rover) {
        val movedRover = start.rotateLeft()
        assertThat(movedRover).isEqualTo(end)
    }

}

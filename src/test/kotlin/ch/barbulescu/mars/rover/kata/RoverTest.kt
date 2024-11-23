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
    @ArgumentsSource(RoverRotateRightTestData::class)
    fun `test rover rotate right`(start: Rover, end: Rover) {
        val movedRover = start.rotateRight()
        assertThat(movedRover).isEqualTo(end)
    }

    @ParameterizedTest
    @ArgumentsSource(RoverRotateLeftTestData::class)
    fun `test rover rotate left`(start: Rover, end: Rover) {
        val movedRover = start.rotateLeft()
        assertThat(movedRover).isEqualTo(end)
    }
}

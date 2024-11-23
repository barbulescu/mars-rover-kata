package ch.barbulescu.mars.rover.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

class RoverTest {

    @ParameterizedTest
    @ArgumentsSource(RoverTestDataSource::class)
    fun `test rover movement on free grid`(start: Rover, end: Rover) {
        val movedRover = start.move()
        assertThat(movedRover).isEqualTo(end)
    }

}

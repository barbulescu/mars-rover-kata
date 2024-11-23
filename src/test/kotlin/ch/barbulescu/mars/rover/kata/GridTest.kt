package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class GridTest {
    private val grid = Grid(5, 5)

    @ParameterizedTest
    @ArgumentsSource(GridTestDataSource::class)
    fun `test rover movement on free grid`(start: Rover, end: Rover) {
        val movedRover = grid.move(start)
        assertThat(movedRover).isEqualTo(end)
    }
}

class GridTestDataSource : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
        Arguments.of(Rover(1, 1, NORTH), Rover(1, 0, NORTH)),
        Arguments.of(Rover(1, 1, EAST), Rover(2, 1, EAST)),
        Arguments.of(Rover(1, 1, SOUTH), Rover(1, 2, SOUTH)),
        Arguments.of(Rover(1, 1, WEST), Rover(0, 1, WEST)),
    )

}

package ch.barbulescu.mars.rover.kata

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import java.util.stream.Stream

class RoverTestDataSource : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
        Arguments.of(Rover(1, 1, Orientation.NORTH), Rover(1, 0, Orientation.NORTH)),
        Arguments.of(Rover(1, 1, Orientation.EAST), Rover(2, 1, Orientation.EAST)),
        Arguments.of(Rover(1, 1, Orientation.SOUTH), Rover(1, 2, Orientation.SOUTH)),
        Arguments.of(Rover(1, 1, Orientation.WEST), Rover(0, 1, Orientation.WEST)),
    )

}

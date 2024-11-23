package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import java.util.stream.Stream

class RoverMoveTestData : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
        Arguments.of(Rover(1, 1, NORTH), Rover(1, 0, NORTH)),
        Arguments.of(Rover(1, 1, EAST), Rover(2, 1, EAST)),
        Arguments.of(Rover(1, 1, SOUTH), Rover(1, 2, SOUTH)),
        Arguments.of(Rover(1, 1, WEST), Rover(0, 1, WEST)),
    )
}

class RoverRotateRightTestData : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
        Arguments.of(Rover(1, 1, NORTH), Rover(1, 1, EAST)),
        Arguments.of(Rover(1, 1, EAST), Rover(1, 1, SOUTH)),
        Arguments.of(Rover(1, 1, SOUTH), Rover(1, 1, WEST)),
        Arguments.of(Rover(1, 1, WEST), Rover(1, 1, NORTH)),
    )
}

class RoverRotateLeftTestData : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
        Arguments.of(Rover(1, 1, NORTH), Rover(1, 1, WEST)),
        Arguments.of(Rover(1, 1, WEST), Rover(1, 1, SOUTH)),
        Arguments.of(Rover(1, 1, SOUTH), Rover(1, 1, EAST)),
        Arguments.of(Rover(1, 1, EAST), Rover(1, 1, NORTH)),
    )
}


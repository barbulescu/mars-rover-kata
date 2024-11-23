package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {
    fun move(): Rover = when (orientation) {
        NORTH -> copy(y = y - 1)
        EAST -> copy(x = x + 1)
        SOUTH -> copy(y = y + 1)
        WEST -> copy(x = x - 1)
    }
}

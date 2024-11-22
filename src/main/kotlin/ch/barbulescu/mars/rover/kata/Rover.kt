package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*

data class Rover(val x: Int, val y: Int) {
    fun move(north: Orientation): Rover = when (north) {
        NORTH -> Rover(x, y - 1)
        EAST -> Rover(x + 1, y)
        SOUTH -> Rover(x, y + 1)
        WEST -> Rover(x - 1, y)
    }
}

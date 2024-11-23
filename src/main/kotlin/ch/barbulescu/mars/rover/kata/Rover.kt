package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {
    fun move(): Rover = when (orientation) {
        NORTH -> copy(y = y - 1)
        EAST -> copy(x = x + 1)
        SOUTH -> copy(y = y + 1)
        WEST -> copy(x = x - 1)
    }

    fun rotateRight(): Rover = when (orientation) {
        NORTH -> copy(orientation = EAST)
        EAST -> copy(orientation = SOUTH)
        SOUTH -> copy(orientation = WEST)
        WEST -> copy(orientation = NORTH)
    }

    fun rotateLeft(): Rover = when (orientation) {
        NORTH -> copy(orientation = WEST)
        WEST -> copy(orientation = SOUTH)
        SOUTH -> copy(orientation = EAST)
        EAST -> copy(orientation = NORTH)
    }
}

fun String.toRover(): Rover {
    val parts = this.split(' ')
    val x = parts[0].toInt()
    val y = parts[1].toInt()
    val orientation = parts[2].toOrientation()
    return Rover(x, y, orientation)
}

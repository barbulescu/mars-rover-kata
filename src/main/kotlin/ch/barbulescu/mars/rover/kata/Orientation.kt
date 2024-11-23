package ch.barbulescu.mars.rover.kata

import ch.barbulescu.mars.rover.kata.Orientation.*

enum class Orientation {
    NORTH,
    EAST,
    SOUTH,
    WEST
}

fun String.toOrientation(): Orientation = when (this) {
    "N" -> NORTH
    "E" -> EAST
    "S" -> SOUTH
    "W" -> WEST
    else -> error("Unable to parse orientation $this")
}

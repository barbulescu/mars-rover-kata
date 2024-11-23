package ch.barbulescu.mars.rover.kata

class Grid(val rows: Int, val cols: Int) {
    fun move(rover: Rover): Rover = rover.move()
}

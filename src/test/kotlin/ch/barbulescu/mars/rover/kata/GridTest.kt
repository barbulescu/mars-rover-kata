package ch.barbulescu.mars.rover.kata

import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GridTest {

    @Test
    fun `grid move is delegated to rover`() {
        val start = mockk<Rover>()
        val end = mockk<Rover>()

        every { start.move() } returns end

        val grid = Grid(5, 5)
        val movedRover = grid.move(start)

        assertThat(movedRover).isSameAs(end)
    }
}


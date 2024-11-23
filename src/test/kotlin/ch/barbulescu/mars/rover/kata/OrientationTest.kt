package ch.barbulescu.mars.rover.kata

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

class OrientationTest {

    @ParameterizedTest
    @ArgumentsSource(OrientationTestData::class)
    fun `string to orientation`(text: String, orientation: Orientation) {
        val actual = text.toOrientation()
        assertThat(actual).isEqualTo(orientation)
    }

    @Test
    fun `random text cannot be convert to orientation`() {
        assertThatThrownBy { "a".toOrientation() }
            .isInstanceOf(IllegalStateException::class.java)
            .hasMessage("Unable to parse orientation a")
    }
}

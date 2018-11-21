package calculator

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class CalculatorTest {

    @Test
    fun checkSum() {
        val result = calculator.sum(100, 200)
        assertNotEquals(100, result, "기대값과 실제값이 다르다.")
        assertEquals(300, result, "기대값과 같음.")
    }
}
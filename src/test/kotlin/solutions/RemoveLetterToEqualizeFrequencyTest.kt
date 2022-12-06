package solutions

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class RemoveLetterToEqualizeFrequencyTest {

    private lateinit var removeLetterToEqualizeFrequency: RemoveLetterToEqualizeFrequency

    @BeforeAll
    fun setup() {
        removeLetterToEqualizeFrequency = RemoveLetterToEqualizeFrequency()
    }

    @Test
    fun case1() {
        val given = "abcc"
        val result = removeLetterToEqualizeFrequency.invoke(given)
        val expectedResult = true
        assert(result == expectedResult)
    }

    @Test
    fun case2() {
        val given = "aazz"
        val result = removeLetterToEqualizeFrequency.invoke(given)
        val expectedResult = false
        assert(result == expectedResult)
    }

    @Test
    fun case3() {
        val given = "bac"
        val result = removeLetterToEqualizeFrequency.invoke(given)
        val expectedResult = true
        assert(result == expectedResult)
    }
}

import kotlin.math.sqrt
import kotlin.test.assertEquals

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {
    var firstSqrt = sqrt(a.toFloat()).toInt()
    if (firstSqrt * firstSqrt == a) firstSqrt--
    return sqrt(b.toFloat()).toInt() - firstSqrt
}

fun main(args: Array<String>) {
    assertEquals(2, squares(3, 9))
    assertEquals(0, squares(17, 24))
    assertEquals(3, squares(24, 49))
    assertEquals(3, squares(4, 23))
    assertEquals(4, squares(1, 23))
    assertEquals(5, squares(1, 25))
    assertEquals(4, squares(2, 25))
    assertEquals(3, squares(35, 70))
    assertEquals(22, squares(100, 1000))
}
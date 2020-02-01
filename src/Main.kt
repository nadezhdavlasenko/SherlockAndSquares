import java.util.*
import kotlin.test.assertEquals
import kotlin.math.sqrt

// Complete the squares function below.
fun squares(a: Int, b: Int): Int {
    var firstSqrt = sqrt(a.toDouble()).toInt()
    if (firstSqrt * firstSqrt == a) firstSqrt--
    return sqrt(b.toDouble()).toInt() - firstSqrt
}

fun main(args: Array<String>) {
    assertEquals(2, squares(3, 9))
    assertEquals(0, squares(17, 24))
    assertEquals(3, squares(24, 49))
    assertEquals(2, squares(24, 48))
    assertEquals(3, squares(24, 50))
    assertEquals(3, squares(4, 23))
    assertEquals(4, squares(1, 23))
    assertEquals(5, squares(1, 25))
    assertEquals(4, squares(2, 25))
    assertEquals(3, squares(35, 70))
    assertEquals(22, squares(100, 1000))
    assertEquals(1, squares(1, 1))
    assertEquals(0, squares(2, 2))
    assertEquals(1, squares(4, 4))
    assertEquals(1, squares(4, 5))
    assertEquals(1, squares(4, 6))
    assertEquals(1, squares(4, 7))
    assertEquals(2, squares(4, 9))
    assertEquals(1, squares(4, 8))
    assertEquals(1, squares(3, 7))
    assertEquals(1, squares(4, 7))
    assertEquals(4811, squares(178809602, 330598161))
    assertEquals(8358, squares(284829997, 636760792))
    assertEquals(2520, squares(344808647, 444776424))


    assertEquals(23457, squares(52473344, 942520592))

    assertEquals(27210, squares(1541214, 809501009))

    assertEquals(4879, squares(199521649, 361172651))
    assertEquals(8392, squares(487742886, 928846721))
    assertEquals(16181, squares(2793360, 318714114))
    assertEquals(13044, squares(77956446, 478438091))

    assertEquals(4884, squares(303390079, 497423761))

    assertEquals(26907, squares(3905781, 834256531))


}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val z1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()
    val z2 = scanner.nextInt()
    val box1 = listOf(x1, y1, z1).sorted()
    val box2 = listOf(x2, y2, z2).sorted()

    print(
            when {
                boxesAreEqual(box1, box2) -> {
                    "Box 1 = Box 2"
                }
                box1IsBigger(box1, box2) -> {
                    "Box 1 > Box 2"
                }
                box2IsBigger(box1, box2) -> {
                    "Box 1 < Box 2"
                }
                else -> {
                    "Incomparable"
                }
            }
    )
}

fun box1IsBigger(array1: List<Int>, array2: List<Int>): Boolean {
    return array1[0] >= array2[0] && array1[1] >= array2[1] && array1[2] >= array2[2]
}

fun box2IsBigger(array1: List<Int>, array2: List<Int>): Boolean {
    return array2[0] >= array1[0] && array2[1] >= array1[1] && array2[2] >= array1[2]
}

fun boxesAreEqual(array1: List<Int>, array2: List<Int>): Boolean {
    return array1[0] == array2[0] && array1[1] == array2[1] && array1[2] == array2[2]
}
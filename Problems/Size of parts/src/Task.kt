import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(number) {
        when (scanner.nextInt()) {
            1 -> larger++
            -1 -> smaller++
            0 -> perfect++
        }
    }

    print("$perfect $larger $smaller")
}
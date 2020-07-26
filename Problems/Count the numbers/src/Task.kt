import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    var count: Int = 0

    for (number in a..b) {
        if (number % n == 0) count++
    }

    println(count)
}
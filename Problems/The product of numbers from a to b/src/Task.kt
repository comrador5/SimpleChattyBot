import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var result = 1L

    for (number in a until b) {
        result *= number
    }
    println(result)

}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val num4 = scanner.nextInt()
    val num5 = scanner.nextInt()

    val range1 = num1..num2
    val range2 = num3..num4

    println("${num5 in range1 || num5 in range2}")
}
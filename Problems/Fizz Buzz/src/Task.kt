import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()

    for (number in start..end) {
        if (number % 15 == 0) {
            println("FizzBuzz")
            continue
        } else if (number % 5 == 0) {
            println("Buzz")
            continue
        } else if (number % 3 == 0) {
            println("Fizz")
            continue
        } else println(number)
    }
}
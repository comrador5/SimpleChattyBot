import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    var sum = 0

    repeat(number) {
        if (scanner.nextInt() > 0) sum++
    }
    println(sum)
}
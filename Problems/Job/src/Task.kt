import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val range = 18..59
    val age = scanner.nextInt()
    print("${age in range}")
}
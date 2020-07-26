import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()

    print(
            if (h in a..b) "Normal"
            else if (h > b) "Excess"
            else "Deficiency"
    )
}
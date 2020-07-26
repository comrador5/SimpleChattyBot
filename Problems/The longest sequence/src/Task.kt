import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    val list = mutableListOf<Int>()
    var longestSequence = 0

    for (i in 1..number) {
        list.add(scanner.nextInt())
    }

    var nextIndex = 0
    var lastIndex = list.lastIndex
    while (nextIndex != list.size) {
        var localSize = 1 //contains at least 1 element
        for (i in nextIndex..lastIndex) {
            if (i == lastIndex) {
                nextIndex += localSize
                if (localSize > longestSequence)
                    longestSequence = localSize
                break
            }
            if (list[i] <= list[i + 1]) {
                localSize++
            } else {
                nextIndex += localSize
                if (localSize > longestSequence)
                    longestSequence = localSize
                break
            }
        }
    }

    println(longestSequence)
}
package bot

fun main(arguments: Array<String>) {
    val range = 1..5
    val name: String = if (7 in range) {
        println("Number is not in range!")
        "Out of range"
    }
    else {
        println("Number is within the range!")
        "Within the range"
    }


}
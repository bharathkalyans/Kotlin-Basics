package telusko

fun main() {


    var nums: List<Int> = listOf(1, 1, 1, 12, 3, 90)


    nums.forEach { t -> println(t) }
    nums.forEach { println(it) }

    nums.forEach(::println)
}
package telusko


fun main() {

    var nums = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var evens = nums.filter { it % 2 == 0 }
    var odds = nums.filter { it % 2 != 0 }


    nums.forEach { println(it) }
    println("EVENS::")
    evens.forEach { println(it) }
    println("ODDS:: ")
    odds.forEach { println(it) }

    println("Doubled Values :: ")
    var doubleValues = nums.map { it * 2 }
    doubleValues.forEach { println(it) }

}
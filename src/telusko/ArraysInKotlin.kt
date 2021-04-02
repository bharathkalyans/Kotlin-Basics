package telusko

fun main() {

    var nums: IntArray = intArrayOf(1, 11, 12, 31, 71)

    nums[0] = 1000
    println(nums[0])

    println(nums.size)


    var names = arrayOfNulls<String>(9)
    names.set(3, "Bharath")

    for (names in names)
        println(names)
}



package com.nasahacker.bgremoverexample


fun main() {
    twoSum(intArrayOf(-1, -2, -3, -4, -5), -8).forEach {
        print(it)
    }

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val listOfInt = mutableSetOf<Int>()
    for (i in nums.indices) {
        for (c in 1..<nums.size) {
            if (nums[i] + nums[c] == target && i != c) {
                listOfInt.add(i)
                listOfInt.add(c)
            }
        }
    }

    return listOfInt.toIntArray()
}


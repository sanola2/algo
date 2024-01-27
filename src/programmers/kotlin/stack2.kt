package programmers.kotlin

import java.util.*

fun main() {
    val priorities = intArrayOf(2, 1, 3, 2)
    val location = 2

    val priorities2 = intArrayOf(1, 1, 9, 1, 1, 1)
    val location2 = 0

    val priorities3 = intArrayOf(1)
    val location3 = 0

    println(solution(priorities2, location2))
}

fun solution(priorities: IntArray, location: Int): Int {
    val queue = kotlin.collections.ArrayDeque<Pair<Int, Boolean>>()

    val markedPriorities = priorities.mapIndexed { index, priority ->
        if (index == location) {
            priority to true
        } else {
            priority to false
        }
    }

    queue.addAll(markedPriorities)

    var found = false
    var count = 1
    while (!found) {
        val firstValue = queue.removeFirst()
        val mostPriority = queue.maxByOrNull { it.first } ?: break

        if (firstValue.first < mostPriority.first) {
            queue.add(firstValue)
        } else {
            if (firstValue.second) {
                break
            }
            count++
        }
    }

    return count
}

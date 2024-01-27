package programmers.kotlin

import java.util.*

fun main() {
    val progresses = intArrayOf(93, 30, 55)
    val speeds = intArrayOf(1, 30, 5)

    val progresses2 = intArrayOf(95, 90, 99, 99, 80, 99)
    val speeds2 = intArrayOf(1, 1, 1, 1, 1, 1)

    solution(progresses2, speeds2).forEach { println(it) }
}


fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val queue = LinkedList<Int>()
    val queue2 = LinkedList<Int>()
    val answer = mutableListOf<Int>()

    queue.addAll(progresses.toList())
    queue2.addAll(speeds.toList())

    var count = 0
    while (queue.size != 0) {
        for (i in 0 until queue.size) {
            queue[i] += queue2[i]
        }

        if (queue.peek() >= 100) {
            queue.pop()
            queue2.pop()
            count++
            for (i in 0 until queue.size) {
                if (queue.peek() >= 100) {
                    queue.pop()
                    queue2.pop()
                    count++
                } else {
                    break
                }
            }

            answer.add(count)
            count = 0
        }
    }

    return answer.toIntArray()
}

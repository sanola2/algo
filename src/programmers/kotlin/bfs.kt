package programmers.kotlin

fun main() {
    val numbers = intArrayOf(1, 1, 1, 1, 1)
    val target = 3

    val numbers2 = intArrayOf(4, 1, 2, 1)
    val target2 = 4

    // println(dfs(numbers, target))
}

fun dfs(numbers: IntArray, target: Int): Int {
    var answer = 0

    fun dfs(x: Int, n: Int) {
        if (n == numbers.size) {
            if (x == target) {
                answer++
            }
            return
        }

        dfs(x + numbers[n], n + 1)
        dfs(x - numbers[n], n + 1)
    }

    dfs(numbers[0], 1)
    dfs(numbers[0] * -1, 1)

    return answer
}

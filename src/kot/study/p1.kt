package kot.study

import java.math.BigInteger

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alice = 0
    var bob = 0
    for (i in a.indices) {
        if (a[i] > b[i]) {
            alice++
        } else if (a[i] < b[i]) {
            bob++
        }
    }
    return arrayOf(alice, bob)
}

// Complete the extraLongFactorials function below.
fun extraLongFactorials(n: Int): Unit {
    var num = BigInteger.ONE
    for (i in 1..n) {
        num = num.multiply(BigInteger.valueOf(i.toLong()))
    }
    println(num)
}

fun main(args: Array<String>) {
    /*val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))*/
    extraLongFactorials(25)
}
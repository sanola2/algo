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

private fun result(result: String) {
    // String escaping loop from JSONStringer
    var out = StringBuilder()
    out.append("\"")
    var i = 0
    val length = result.length
    while (i < length) {
        /*
         * From RFC 4627, "All Unicode characters may be placed within the
         * quotation marks except for the characters that must be escaped:
         * quotation mark, reverse solidus, and the control characters
         * (U+0000 through U+001F)."
         */
        when (val c = result[i]) {
            '"', '\\', '/' -> out.append('\\').append(c)
            '\t' -> out.append("\\t")
            '\b' -> out.append("\\b")
            '\n' -> out.append("\\n")
            '\r' -> out.append("\\r")
            //'\f' -> out.append("\\f")
            else -> if (c.toInt() <= 0x1F) {
                out.append(String.format("\\u%04x", c.toInt()))
            } else {
                out.append(c)
            }
        }
        i++
    }
    out.append("\"")

    val resultString = out.toString()
    println(resultString)
}

fun main(args: Array<String>) {
    /*val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))*/
    val a: Int? = null
    println(a?.also {
        println("sdaf$it")
        it.toLong() })
  //  extraLongFactorials(25)
}
// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun findOddOccurrence(A: IntArray): Int {
    var result = 0
    for (i in A) {
        result = result xor i
    }
    return result
}

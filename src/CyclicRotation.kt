// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray, K: Int): IntArray {
    if (A.isEmpty() || K == 0 || A.size == K) return  A
    // Implement your solution here
    for (i in 1..K) {
        var last = A.last()
        for (i in A.size-1 downTo 1) {
            A[i] = A[i-1]
        }
        A[0] = last
    }
    return A
}
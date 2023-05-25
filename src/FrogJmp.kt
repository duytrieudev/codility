// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")


//this solution is cancelled due to time required
//fun solution(X: Int, Y: Int, D: Int): Int {
//    // Implement your solution here
//    var currentPosition = X
//    var result = 0
//    if (X >= Y) return 0
//    for (i in 1..Int.MAX_VALUE) {
//        currentPosition = currentPosition + D
//        if (currentPosition >= D) break
//        result = i
//    }
//    return result
//}

fun frogJmp(X: Int, Y: Int, D: Int): Int {
    // Implement your solution here
    val distance = Y-X
    val jumpTimeDown = distance/D
    return if (distance % D > 0) {
        jumpTimeDown + 1
    } else {
        jumpTimeDown
    }
}

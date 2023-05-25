import java.util.ArrayDeque

// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")


fun solution(N: Int): Int {
    //convert to binary
    var binaryType = N.toString(2)
    //create a stack
    var stack = ArrayDeque<Char>()
    var listResult = mutableListOf<Int>()
    //make loop
    for (i in binaryType) {
        if (i == '1' && stack.size == 0) {
            stack.push('0')
        } else if (i == '1' && stack.size > 0) {
            listResult.add(stack.size - 1)
            stack.clear()
            stack.push('0')
        } else if (i == '0' && stack.size > 0) {
            stack.push('0')
        }
    }
    var result = listResult.maxOrNull() ?: 0
    return result
}


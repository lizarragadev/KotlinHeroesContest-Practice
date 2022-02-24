import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    _writer.problemA()
    _writer.flush()
}

fun PrintWriter.problemA() {
    val t = readInt()
    if(t in 1..100) {
        for (i in 1..t) {
            val a = fillArray(t)
            println(findPosition(a))
        }
    }
}

fun fillArray(t: Int): MutableList<Int> {
    val n = readInt()
    val a = mutableListOf<Int>()
    a.clear()
    if (n in 3..100) {
        for (j in 1..n) {
            val ai = readInt()
            if(ai in 1..100) {
                a.add(ai)
            }
        }
    }
    return a
}

fun findPosition(a: MutableList<Int>): Int {
    var position = -1
    for ( (index, value) in a.withIndex()) {
        if (Collections.frequency(a, value) == 1) {
            position = index
            break
        }
    }
    return position + 1
}
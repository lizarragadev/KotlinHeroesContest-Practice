import java.io.PrintWriter
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    _writer.problemC()
    _writer.flush()
}

fun PrintWriter.problemC() {
    val a = fillList(readInt())
    a.sort()
    var count = 0
    for (i in 1 until a.size step 2)
        count += (a[i - 1] - a[ i ]).absoluteValue
    print(count)
}

fun fillList(n: Int) : MutableList<Int> {
    val a = mutableListOf<Int>()
    for (i in 1..n) a.add(readInt())
    return a
}
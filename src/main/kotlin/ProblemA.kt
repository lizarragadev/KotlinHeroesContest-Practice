import java.io.PrintWriter
import java.util.*

@JvmField val INPUT = System.`in`
@JvmField val OUTPUT = System.out

@JvmField val _reader = INPUT.bufferedReader()
fun readLine(): String? = _reader.readLine()
fun readLn() = _reader.readLine()!!
@JvmField var _tokenizer: StringTokenizer = StringTokenizer("")
fun read(): String {
    while (_tokenizer.hasMoreTokens().not()) _tokenizer = StringTokenizer(_reader.readLine() ?: return "", " ")
    return _tokenizer.nextToken()
}
fun readInt() = read().toInt()
fun readDouble() = read().toDouble()
fun readLong() = read().toLong()
fun readStrings(n: Int) = List(n) { read() }
fun readLines(n: Int) = List(n) { readLn() }
fun readInts(n: Int) = List(n) { read().toInt() }
fun readIntArray(n: Int) = IntArray(n) { read().toInt() }
fun readDoubles(n: Int) = List(n) { read().toDouble() }
fun readDoubleArray(n: Int) = DoubleArray(n) { read().toDouble() }
fun readLongs(n: Int) = List(n) { read().toLong() }
fun readLongArray(n: Int) = LongArray(n) { read().toLong() }

@JvmField val _writer = PrintWriter(OUTPUT, false)
inline fun output(block: PrintWriter.() -> Unit) { _writer.apply(block).flush() }

/********************** CODE *********************/

fun main(args: Array<String>) {
    _writer.solve()
    _writer.flush()
}

fun PrintWriter.solve() {
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

/********************** CODE *********************/
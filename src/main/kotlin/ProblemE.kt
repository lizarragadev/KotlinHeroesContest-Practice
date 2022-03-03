import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    _writer.problemE()
    _writer.flush()
}

fun PrintWriter.problemE() {
    val n = readInt()
    val k = readInt()
    sumIfItsPossible(n, k)
}

fun sumIfItsPossible(n: Int, k: Int) {
    var sum: Int = k
    val A = IntArray(k)
    Arrays.fill(A, 0, k, 1)
    for (i in k - 1 downTo 0) {
        while (sum + A[i] <= n) {
            sum += A[i]
            A[i] *= 2
        }
    }
    if (sum != n) {
        print("NO")
    } else {
        println("YES")
        for (i in 0 until k) print("${A[i]} ")
    }
}
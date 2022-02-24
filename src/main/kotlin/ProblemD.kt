import java.io.PrintWriter
import java.util.*
import java.util.stream.Collectors
import kotlin.math.pow

fun main(args: Array<String>) {
    _writer.problemD()
    _writer.flush()
}

fun PrintWriter.problemD() {
    val n = readInt()
    if (n in 1..((2*10.toDouble().pow(5.toDouble())).toInt())) {
        val a = fillListD(n)
        if(a.size > 1) {
            a.sort()
            val asc = mutableListOf<Int>()
            val desc = mutableListOf<Int>()
            for (i in a) {
                // iterar uno a uno con el siguiente y ver si son iguales
            }
        } else {
            // imprimir res de 1
        }

        //val set = a.stream().distinct().collect(Collectors.toList())


    }
}

fun fillListD(n: Int) : MutableList<Int> {
    val a = mutableListOf<Int>()
    for (i in 1..n) a.add(readInt())
    return a
}
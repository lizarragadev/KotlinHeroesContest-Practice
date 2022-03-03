import java.io.PrintWriter
import kotlin.math.pow

val responseAffirmetive = "YES"
val responseNegative = "NO"
val a = mutableListOf<Int>()
val asc = mutableListOf<Int>()
val desc = mutableListOf<Int>()
var invalid = false
var repeated = -1

fun main(args: Array<String>) {
    _writer.problemD()
    _writer.flush()
}

fun PrintWriter.problemD() {
    val n = readInt()
    if (n in 1..((2*10.toDouble().pow(5.toDouble())).toInt())) {
        fillListD(n)
        if(a.size > 1) {
            a.sortDescending()
            while(a.isNotEmpty()) {
                if(a[0] != repeated) {
                    if(a.size != 1) {
                        if(a[0] == a[1]) {
                            repeated = a[0]
                            asc.add(a[0])
                            a.removeAt(0)
                        }
                    }
                    desc.add(a[0])
                    a.removeAt(0)
                } else {
                    invalid = true
                    break
                }
            }
            printResponse()
        } else {
            desc.add(a[0])
            printResponse()
        }
    }
}

fun printResponse() {
    if(!invalid) {
        println(responseAffirmetive)
        println(asc.size)
        asc.sort()
        asc.forEach { print("$it ") }
        println("\n${desc.size}")
        //desc.sortDescending()
        if(desc.isEmpty()) println("") else  desc.forEach { print("$it ") }
    } else {
        print(responseNegative)
    }
}

fun fillListD(n: Int) {
    for (i in 1..n) a.add(readInt())
}
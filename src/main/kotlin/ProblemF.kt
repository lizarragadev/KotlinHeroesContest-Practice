import java.io.PrintWriter

fun main(args: Array<String>) {
    _writer.problemF()
    _writer.flush()
}

fun PrintWriter.problemF() {
    val n = readInt()
    if(n in 1..150000) {
        val weights = IntArray(n)
        for (i in 0 until n) {
            val weight = readInt()
            if(n in 1.. 150000) {
                weights[i] = weight
            }
        }
        if(weights.size >= 3) {
            println(weights.distinctBy { it })
            println(weights.distinct())
            /*weights.sort()
            weights.forEachIndexed { index, value ->

            }*/
        } else {
            if (weights.size != 1) {
                if(weights[0] == weights[1]) {
                    weights[0] = weights[0] + 1
                }
            }
            println(weights.size)
        }

        //weights.forEach { print("$it ") }

    }
}
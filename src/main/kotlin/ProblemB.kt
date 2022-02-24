import java.io.PrintWriter

fun main(args: Array<String>) {
    _writer.problemB()
    _writer.flush()
}

fun PrintWriter.problemB() {
    val n = readInt()
    val t = readLn()
    if(n in 1..55) {
        if(t.length == n) {
            println(descrypt(t))
        }
    }
}

fun descrypt(t: String): String {
    var cont = 2
    var pos = 0
    var s = ""
    var decrypted = false
    while(!decrypted) {
        if(pos < t.length) {
            s += t[pos]
            pos += cont
            cont++
        } else decrypted = true
    }
    return s
}
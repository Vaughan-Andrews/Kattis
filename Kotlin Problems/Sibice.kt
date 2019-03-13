import java.util.*

fun main(args: Array<String>) {
    val stdin = Scanner(System.`in`)
    val loopAmt = stdin.nextInt()
    val a = Math.pow(stdin.nextInt().toDouble(), 2.0)
    val b = Math.pow(stdin.nextInt().toDouble(), 2.0)
    val max = Math.sqrt(a + b)
    for (i in 0 until loopAmt) {
        if (stdin.nextInt() <= max) {
            println("DA")
        } else {
            println("NE")
        }
    }

}
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var s = scanner.nextInt()


    if (a > b && s < a ) {
        println(a)

    }else
    if (b > a && b > s) {
        println(b)

    }else
        if (s > a && s > b) {
            println(a)
        }
}
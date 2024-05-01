fun main() {
    var str = readlnOrNull()
    for (i in 1..10) {
        println(str?.repeat(i))
    }
}
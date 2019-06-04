fun returnFunc(num: Int): () -> Unit = { println(num) }
fun main(args: Array<String>) {
    var makeSure: Int.(left: Int, right: Int) -> Int
    makeSure = { left: Int, right: Int ->
        if (this < left) left
        else if (this > right) right
        else this
    }
    println(15.makeSure(20, 40))
}
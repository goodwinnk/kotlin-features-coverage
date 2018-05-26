package coverage.closure

fun f() {
    var i = 1
    fun testFun() {
        i++
    }

    testFun()
}

fun test() {
    f()
}
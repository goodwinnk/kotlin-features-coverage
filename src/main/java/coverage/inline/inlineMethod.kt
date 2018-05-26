package coverage.inline

inline fun inlineCall(b: Boolean) {
    println("start")
    if (b) {
        println("true")
    } else {
        println("false")
    }
}

fun test() {
    inlineCall(true)
    inlineCall(false)
}
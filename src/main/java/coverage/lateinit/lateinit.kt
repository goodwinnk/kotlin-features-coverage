package coverage.lateinit

class Lateinit {
    lateinit var some: Any
}

fun test() {
    val lateinit = Lateinit()

    // Missed branches and instructions in getter if there's no check for non-initialized variable read.
    // But this behaviour is similar to Java, and probably should be considered as normal.
    lateinit.some = 12
    lateinit.some
}
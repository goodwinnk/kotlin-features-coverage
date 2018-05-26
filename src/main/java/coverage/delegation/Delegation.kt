package coverage.delegation

interface Delegate {
    fun foo()
    fun bar()
    fun faz()
}

class Tested: Delegate {
    override fun bar() {
        println("bar")
    }

    override fun foo() {
        println("foo")
    }

    override fun faz() {
        println("faz")
    }
}

class Usage(private val tested: Delegate) : Delegate by tested {
    override fun faz() {
        println("fazfaz")
    }
}

fun test() {
    // Tested should be fully covered
    val tested = Tested()
    tested.bar()
    tested.foo()
    tested.faz()

    // Usage.bar() has only delegation call, but its is left uncovered.
    val untested = Usage(tested)
    untested.foo()
    untested.faz()
}
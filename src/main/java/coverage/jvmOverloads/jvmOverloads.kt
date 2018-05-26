package coverage.jvmOverloads

import coverage.jvmOverloads.WithJvmOverloads.withOverloads

object WithJvmOverloads {
    @JvmOverloads
    fun withOverloads(i: Int = 12, s: String = "") {

    }
}

fun test() {
    // It's valid situation when when JvmOverloads needed for single parameters calls.
    // withOverloads() is left uncovered.
    withOverloads(12)
    withOverloads(s = "String")
}
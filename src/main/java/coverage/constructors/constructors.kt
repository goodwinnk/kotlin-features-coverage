package coverage.constructors

import coverage.util.utilize

class Test(val i: Int, s: String) {
    init {
        utilize(s)
    }
}

fun test() {
    Test(12, "").i
}
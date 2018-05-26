package coverage.properties

class WithProperties {
    val lazyVal = lazy { 12 }
}

fun test() {
    val wp = WithProperties()
    wp.lazyVal.value
}
package coverage.properties

class WithProperties {
    val lazyVal = lazy { 12 }
}

class PrivateProperties {
    private var a = 1

    fun test() {
        a++
    }
}

fun test() {
    val wp = WithProperties()
    wp.lazyVal.value

    val pp = PrivateProperties()
    pp.test()
}
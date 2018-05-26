package coverage.normalClass

private class KotlinClass {
    fun testMethod() {
        println("Hi")
    }

    fun otherMethod() {
        println("Hello")
    }

    fun ifTest(param: Int) {
        if (param > 3) {
            println(param)
        } else {
            println(param)
        }
    }
}

fun test() {
    val kotlinClass = KotlinClass()
    kotlinClass.testMethod()
    kotlinClass.otherMethod()
    kotlinClass.ifTest(0)
    kotlinClass.ifTest(4)

}


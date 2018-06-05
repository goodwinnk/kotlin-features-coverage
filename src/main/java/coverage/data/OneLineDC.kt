package coverage.data

data class OneLineDC(val a: Int, val b: String, val c: Any = 12) {
    override fun hashCode() = 3
}

fun testOneLine() {
    val oneLineDC = OneLineDC(12, "", "")
    oneLineDC.a
    oneLineDC.b
    oneLineDC.c

    oneLineDC.hashCode()
}
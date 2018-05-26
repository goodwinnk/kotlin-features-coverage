package coverage.data

data class MultilineDC(
    val a: Int,
    var b: String
)

fun testMultiline() {
    val multilineDC = MultilineDC(12, "")
    multilineDC.a
    multilineDC.b
    multilineDC.b = "new"
}

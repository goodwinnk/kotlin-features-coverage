package coverage.inlineLib

private fun usages() {
    listOf(1, 2, 3).filter {
        it > 1
    }.map { it * 2 }.forEach {
        val text = "Text: $it"
        println(text)
    }
}

fun test() {
    usages()
}
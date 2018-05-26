package coverage.defaultParameters

// No bad with this method
fun function(i: Int = 1, j: String = "") {

}

fun test() {
    function(12)
    function(j = "Hi")
}
package coverage.coroutines

import kotlin.coroutines.experimental.buildSequence

fun test() {
    // invoke method is uncovered
    // several branches in doResume reported uncovered
    val sequence = buildSequence {
        yield(1)
        yield(2)
        yield(3)
    }

    println("coverage.coroutines " + sequence.toList())
}
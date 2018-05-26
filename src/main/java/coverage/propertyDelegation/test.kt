package coverage.propertyDelegation

import kotlin.properties.Delegates

class Class {
    val lazyValue by lazy { 12 }

    var observableVariable by Delegates.observable("Init") { p, old, new ->
        println("$old -> $new")
    }
}

fun test() {
    val clazz = Class()

    clazz.lazyValue

    clazz.observableVariable
    clazz.observableVariable = "New"
}
package tests.coverage

import org.junit.Test

class Tests {
    @Test
    fun bad() {
        coverage.coroutines.test() // todo
        coverage.data.test()
        coverage.jvmOverloads.test()
        coverage.inline.test()
        coverage.delegation.test()
    }

    @Test
    fun ok() {
        coverage.propertyDelegation.test()
        coverage.constructors.test()
        coverage.closure.test()
        coverage.defaultParameters.test()
        coverage.inlineLib.test()
        coverage.normalClass.test()
        coverage.properties.test()
        coverage.lateinit.test()
    }
}
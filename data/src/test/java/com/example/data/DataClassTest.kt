package com.example.data

import org.junit.Test

import org.junit.Assert.*

class DataClassTest {

    @Test
    fun multiply() {

        val dataClass = DataClass()

        assertTrue(8 == dataClass.multiply(2,4))
    }
}
package com.example.sonarcube

import org.junit.Test

import org.junit.Assert.*

class AppClassTest {

    @Test
    fun sum() {

        val appClass = AppClass()

        assertTrue(6 == appClass.sum(2,4))
    }
}
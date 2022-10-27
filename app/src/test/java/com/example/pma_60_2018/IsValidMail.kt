package com.example.pma_60_2018



import junit.framework.TestCase.assertTrue
import org.junit.Test

class IsValidMail {

    @Test
    fun test_isValidEmail(){
        assertTrue(EmailValidator.isValidEmail("nenadjankovic617@gmail.com"))
    }
}
package com.example.compose.rally

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import junit.framework.Assert.fail
import org.junit.Test

class RallyNavHostTest {

    @get:Test
    val composeTestRule = createComposeRule()

    private lateinit var navController: NavHostController

    @Test
    fun rallyNavHost() {
        composeTestRule.setContent {
            navController = rememberNavController()
            RallyNavHost(navController = navController)
        }
        fail()
    }
}

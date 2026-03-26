package com.example.guiapa

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.guiapa.ui.screens.HomeScreen
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class HomeScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun homeScreen_displaysCategories_allCategoriesAreDisplayed() {
        composeTestRule.setContent {
            HomeScreen(onCategoryClick = {})
        }
        composeTestRule.onNodeWithText("Restaurantes e Lanchonetes").assertExists()
        composeTestRule.onNodeWithText("Saúde e Beleza").assertExists()
        composeTestRule.onNodeWithText("Compras e Varejo").assertExists()
        composeTestRule.onNodeWithText("Serviços").assertExists()
        composeTestRule.onNodeWithText("Entretenimento e Lazer").assertExists()
        composeTestRule.onNodeWithText("Reformas e Construção").assertExists()
    }

    @Test
    fun homeScreen_onCategoryClick_onCategoryClickIsTriggered(){
        var clickedCategory = false

        composeTestRule.setContent {
            HomeScreen(onCategoryClick = {clickedCategory = true})
        }
        composeTestRule.onNodeWithText("Restaurantes e Lanchonetes").performClick()
        assert(clickedCategory)

    }
}
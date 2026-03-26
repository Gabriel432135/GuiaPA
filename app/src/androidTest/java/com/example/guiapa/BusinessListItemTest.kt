package com.example.guiapa

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.guiapa.model.Business
import com.example.guiapa.model.Category
import com.example.guiapa.ui.screens.BusinessList
import org.junit.Rule
import org.junit.Test

class BusinessListItemTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val fakeBusiness1 = Business(
        id = 1,
        name = "Café do Zé",
        description = "Melhor café de Pouso Alegre",
        address = "Rua Central, 123",
        phone = "3599999999",
        website = "www.cafeze.com",
        category = Category.FOOD_BEVERAGE,
        imageRes = android.R.drawable.ic_menu_gallery
    )

    private val fakeBusiness2 = Business(
        id = 2,
        name = "Bar do Zé",
        description = "Melhor bar de Pouso Alegre",
        address = "Rua Central, 124",
        phone = "3599999991",
        website = "www.barze.com",
        category = Category.FOOD_BEVERAGE,
        imageRes = android.R.drawable.ic_menu_gallery
    )

    @Test
    fun businessListItem_displaysBusinessInfo_businessCardIsDisplayed() {

        composeTestRule.setContent {
            BusinessList(
                businesses = listOf(fakeBusiness1, fakeBusiness2),
                onBusinessClick = {},
                onBackClick = {}
            )
        }

        composeTestRule.onNodeWithText("Café do Zé").assertIsDisplayed()
        composeTestRule.onNodeWithText("Melhor café de Pouso Alegre").assertIsDisplayed()
        composeTestRule.onNodeWithText("${fakeBusiness1.phone} • ${fakeBusiness1.website}").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rua Central, 123").assertIsDisplayed()

        composeTestRule.onNodeWithText("Bar do Zé").assertIsDisplayed()
        composeTestRule.onNodeWithText("Melhor bar de Pouso Alegre").assertIsDisplayed()
        composeTestRule.onNodeWithText("${fakeBusiness2.phone} • ${fakeBusiness2.website}").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rua Central, 124").assertIsDisplayed()
    }

    @Test
    fun businessList_clickOnItem_triggersAction() {
        var clickedBusinessId = -1
        composeTestRule.setContent {BusinessList(
            businesses = listOf(fakeBusiness1),
            onBusinessClick = { clickedBusinessId = it.id },
            onBackClick = {}
        )
        }
        composeTestRule.onNodeWithText("Café do Zé").performClick()
        assert(clickedBusinessId == 1)
    }


}
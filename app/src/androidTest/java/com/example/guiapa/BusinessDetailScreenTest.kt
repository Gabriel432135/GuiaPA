package com.example.guiapa

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.guiapa.model.Business
import com.example.guiapa.model.Category
import com.example.guiapa.ui.screens.BusinessDetailScreen
import com.example.guiapa.ui.theme.GuiaPATheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class BusinessDetailScreenTest{

    @get:Rule
    val composeTestRule = createComposeRule()

    private val fakeBusiness = Business(
        id = 1,
        name = "Café do Zé",
        description = "Melhor café de Pouso Alegre",
        address = "Rua Central, 123",
        phone = "3599999999",
        website = "www.cafeze.com",
        category = Category.FOOD_BEVERAGE,
        imageRes = android.R.drawable.ic_menu_gallery
    )

    @Before
    fun setupBusinessDetailScreen(){
        composeTestRule.setContent {
            GuiaPATheme() {
                BusinessDetailScreen(
                    business = fakeBusiness,
                    onBackClick = {},
                    onCallClick = {},
                    onLocationClick = {},
                    onWebClick = {}
                )
            }
        }
    }

    @Test
    fun detailScreen_displaysBusinessInfo() {
        composeTestRule.onNodeWithText("Café do Zé").assertIsDisplayed()
        composeTestRule.onNodeWithText("Melhor café de Pouso Alegre").assertIsDisplayed()
    }

    @Test
    fun detailScreen_clickButtons_triggersAction(){
        var onCallClickClicked = false
        var onLocationClickClicked = false
        var onWebClickClicked = false
        composeTestRule.setContent {
            GuiaPATheme {
                BusinessDetailScreen(
                    business = fakeBusiness,
                    onBackClick = {},
                    onCallClick = { onCallClickClicked = true },
                    onLocationClick = {onLocationClickClicked = true},
                    onWebClick = {onWebClickClicked = true}
                )
            }
        }

        composeTestRule.onNodeWithText("Ligar").performClick()
        composeTestRule.onNodeWithText("Endereço").performClick()
        composeTestRule.onNodeWithText("Site").performClick()

        assert(onCallClickClicked)
        assert(onLocationClickClicked)
        assert(onWebClickClicked)
    }
}
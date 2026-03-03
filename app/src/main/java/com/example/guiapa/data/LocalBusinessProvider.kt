package com.example.guiapa.data

import android.content.Context
import com.example.guiapa.R
import com.example.guiapa.model.Business
import com.example.guiapa.model.Category

object LocalBusinessProvider {

    fun getBusinessList(context: Context): List<Business> {
        return listOf(
            Business(
                id =1,
                name = context.getString(R.string.biz_1_name),
                description = context.getString(R.string.biz_1_desc),
                address = context.getString(R.string.biz_1_address),
                phone = context.getString(R.string.biz_1_phone),
                website = context.getString(R.string.biz_1_web),
                category = getBusinessCategory(context.getString(R.string.biz_1_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 2,
                name = context.getString(R.string.biz_2_name),
                description = context.getString(R.string.biz_2_desc),
                address = context.getString(R.string.biz_2_address),
                phone = context.getString(R.string.biz_2_phone),
                website = context.getString(R.string.biz_2_web),
                category = getBusinessCategory(context.getString(R.string.biz_2_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 3,
                name = context.getString(R.string.biz_3_name),
                description = context.getString(R.string.biz_3_desc),
                address = context.getString(R.string.biz_3_address),
                phone = context.getString(R.string.biz_3_phone),
                website = context.getString(R.string.biz_3_web),
                category = getBusinessCategory(context.getString(R.string.biz_3_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 4,
                name = context.getString(R.string.biz_4_name),
                description = context.getString(R.string.biz_4_desc),
                address = context.getString(R.string.biz_4_address),
                phone = context.getString(R.string.biz_4_phone),
                website = context.getString(R.string.biz_4_web),
                category = getBusinessCategory(context.getString(R.string.biz_4_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 5,
                name = context.getString(R.string.biz_5_name),
                description = context.getString(R.string.biz_5_desc),
                address = context.getString(R.string.biz_5_address),
                phone = context.getString(R.string.biz_5_phone),
                website = context.getString(R.string.biz_5_web),
                category = getBusinessCategory(context.getString(R.string.biz_5_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 6,
                name = context.getString(R.string.biz_6_name),
                description = context.getString(R.string.biz_6_desc),
                address = context.getString(R.string.biz_6_address),
                phone = context.getString(R.string.biz_6_phone),
                website = context.getString(R.string.biz_6_web),
                category = getBusinessCategory(context.getString(R.string.biz_6_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 7,
                name = context.getString(R.string.biz_7_name),
                description = context.getString(R.string.biz_7_desc),
                address = context.getString(R.string.biz_7_address),
                phone = context.getString(R.string.biz_7_phone),
                website = context.getString(R.string.biz_7_web),
                category = getBusinessCategory(context.getString(R.string.biz_7_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 8,
                name = context.getString(R.string.biz_8_name),
                description = context.getString(R.string.biz_8_desc),
                address = context.getString(R.string.biz_8_address),
                phone = context.getString(R.string.biz_8_phone),
                website = context.getString(R.string.biz_8_web),
                category = getBusinessCategory(context.getString(R.string.biz_8_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 9,
                name = context.getString(R.string.biz_9_name),
                description = context.getString(R.string.biz_9_desc),
                address = context.getString(R.string.biz_9_address),
                phone = context.getString(R.string.biz_9_phone),
                website = context.getString(R.string.biz_9_web),
                category = getBusinessCategory(context.getString(R.string.biz_9_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 10,
                name = context.getString(R.string.biz_10_name),
                description = context.getString(R.string.biz_10_desc),
                address = context.getString(R.string.biz_10_address),
                phone = context.getString(R.string.biz_10_phone),
                website = context.getString(R.string.biz_10_web),
                category = getBusinessCategory(context.getString(R.string.biz_10_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 11,
                name = context.getString(R.string.biz_11_name),
                description = context.getString(R.string.biz_11_desc),
                address = context.getString(R.string.biz_11_address),
                phone = context.getString(R.string.biz_11_phone),
                website = context.getString(R.string.biz_11_web),
                category = getBusinessCategory(context.getString(R.string.biz_11_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 12,
                name = context.getString(R.string.biz_12_name),
                description = context.getString(R.string.biz_12_desc),
                address = context.getString(R.string.biz_12_address),
                phone = context.getString(R.string.biz_12_phone),
                website = context.getString(R.string.biz_12_web),
                category = getBusinessCategory(context.getString(R.string.biz_12_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 13,
                name = context.getString(R.string.biz_13_name),
                description = context.getString(R.string.biz_13_desc),
                address = context.getString(R.string.biz_13_address),
                phone = context.getString(R.string.biz_13_phone),
                website = context.getString(R.string.biz_13_web),
                category = getBusinessCategory(context.getString(R.string.biz_13_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 14,
                name = context.getString(R.string.biz_14_name),
                description = context.getString(R.string.biz_14_desc),
                address = context.getString(R.string.biz_14_address),
                phone = context.getString(R.string.biz_14_phone),
                website = context.getString(R.string.biz_14_web),
                category = getBusinessCategory(context.getString(R.string.biz_14_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            ),
            Business(
                id = 15,
                name = context.getString(R.string.biz_15_name),
                description = context.getString(R.string.biz_15_desc),
                address = context.getString(R.string.biz_15_address),
                phone = context.getString(R.string.biz_15_phone),
                website = context.getString(R.string.biz_15_web),
                category = getBusinessCategory(context.getString(R.string.biz_15_cat)),
                imageRes = android.R.drawable.ic_menu_gallery
            )
        )
    }
}

private fun getBusinessCategory(category: String): Category{
    return when(category){
        "FOOD_BEVERAGE" -> Category.FOOD_BEVERAGE
        "HEALTH_BEAUTY" -> Category.HEALTH_BEAUTY
        "SHOPPING_RETAIL" -> Category.SHOPPING_RETAIL
        "SERVICES" -> Category.SERVICES
        "ENTERTAINMENT_LEISURE" -> Category.ENTERTAINMENT_LEISURE
        "HOME_IMPROVEMENT_CONSTRUCTION" -> Category.HOME_IMPROVEMENT_CONSTRUCTION
        else -> Category.UNDEFINED
    }
}
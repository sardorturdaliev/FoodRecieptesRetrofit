package com.sardordev.foodreciepts.data.model

data class FoodDataModel(
    val calories: Double,
    val carbohydrates_in_grams: Double,
    val category: Category,
    val chef: Any,
    val cook_time_in_minutes: Int,
    val cook_time_note: Any,
    val difficulty: String,
    val directions_step_1: String,
    val directions_step_10: Any,
    val directions_step_2: String,
    val directions_step_3: String,
    val directions_step_4: String,
    val directions_step_5: String,
    val directions_step_6: Any,
    val directions_step_7: Any,
    val directions_step_8: Any,
    val directions_step_9: Any,
    val fat_in_grams: Double,
    val id: Int,
    val image: String,
    val image_attribution_name: Any,
    val image_attribution_url: Any,
    val image_creative_commons: Boolean,
    val ingredient_1: String,
    val ingredient_10: Any,
    val ingredient_2: String,
    val ingredient_3: String,
    val ingredient_4: String,
    val ingredient_5: String,
    val ingredient_6: Any,
    val ingredient_7: Any,
    val ingredient_8: Any,
    val ingredient_9: Any,
    val measurement_1: Double,
    val measurement_10: Any,
    val measurement_2: Double,
    val measurement_3: Double,
    val measurement_4: Double,
    val measurement_5: Double,
    val measurement_6: Any,
    val measurement_7: Any,
    val measurement_8: Any,
    val measurement_9: Any,
    val prep_time_in_minutes: Int,
    val prep_time_note: Any,
    val protein_in_grams: Double,
    val recipe: String,
    val serving: Int,
    val source_url: Any
)
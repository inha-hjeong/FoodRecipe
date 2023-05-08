package com.foodrecipe.api.response

import com.foodrecipe.api.model.RecipeDto
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse(

    @SerializedName("count")
        var count: Int,

    @SerializedName("results")
        var recipes: List<RecipeDto>,
)


package com.example.myrecipeapp

data class Category(val idCategory: String,
                    val strCategory: String,
                    val strCategoryThumb: String,
                    val strCategoryDescription: String)
{

}
data class CategoriesResponsive(val categories: List<Category>){

}
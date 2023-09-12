package com.smartsolution.myinstagramapp.data

data class PostData(
    val user: String,
    val image: Int,
    val description: String,
    val likes: Int,
    val date: String,
    val numComments: Int
)

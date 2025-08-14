package com.example.frontendbook.data.api.dto

import com.google.gson.annotations.SerializedName

data class BooksListWrapper(
    @SerializedName("bookResponseDTOList")
    val books: List<BookDto>
)
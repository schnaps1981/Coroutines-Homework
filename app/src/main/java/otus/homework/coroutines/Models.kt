package otus.homework.coroutines

import com.google.gson.annotations.SerializedName

data class Fact(
	@field:SerializedName("fact")
	val text: String,
	@field:SerializedName("length")
	val length: Int
)

data class CatImage(
	@field:SerializedName("file")
	val url: String
)

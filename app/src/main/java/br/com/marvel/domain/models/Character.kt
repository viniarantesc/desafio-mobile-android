package br.com.marvel.domain.models

import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.parcelize.Parcelize

@JsonIgnoreProperties(ignoreUnknown = true)
@Parcelize
data class Character(
    @JsonProperty("id") val id: Int,
    @JsonProperty("name") val name: String,
    @JsonProperty("description") val description: String = "Without description",
    @JsonProperty("thumbnail") val thumbnail: Thumbnail,
) : Parcelable

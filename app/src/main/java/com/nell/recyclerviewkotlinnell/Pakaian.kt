package com.nell.recyclerviewkotlinnell

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pakaian(
    val imgPakaian: Int,
    val namePakaian: String,
    val descPakaian: String
) : Parcelable

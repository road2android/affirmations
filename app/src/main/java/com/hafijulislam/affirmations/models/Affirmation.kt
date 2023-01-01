package com.hafijulislam.affirmations.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val titleResourceId: Int,
    @DrawableRes val imageResourceId: Int
) {

}

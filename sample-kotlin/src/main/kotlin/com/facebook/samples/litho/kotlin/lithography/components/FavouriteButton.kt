/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.samples.litho.kotlin.lithography.components

import android.R.drawable.star_off
import android.R.drawable.star_on
import com.facebook.litho.Clickable
import com.facebook.litho.Decoration
import com.facebook.litho.FixedSize
import com.facebook.litho.KComponent
import com.facebook.litho.Row
import com.facebook.litho.dp
import com.facebook.litho.drawableRes
import com.facebook.litho.updateState
import com.facebook.litho.useState
import com.facebook.litho.value

class FavouriteButton : KComponent({

  val isFavourite by useState { false }
  val background = drawableRes(if (isFavourite.value) star_on else star_off)

  Clickable(onClick = { updateState { isFavourite.value = !isFavourite.value } }) {
    FixedSize(width = 32.dp, height = 32.dp) {
      Decoration(background = background) {
        Row()
      }
    }
  }
})

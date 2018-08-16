package toombs.game

import android.graphics.Color
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape

class Hero : ShapeDrawable
{
    constructor() : super(OvalShape()) {
        intrinsicHeight = 100
        intrinsicWidth = 100
        paint.color = Color.parseColor("#00FF00")
    }


 }

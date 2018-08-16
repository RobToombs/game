package toombs.game

import android.app.Activity
import android.graphics.PixelFormat
import android.os.Bundle
import android.view.SurfaceView
import android.view.Window

class Game : Activity()
{
    private var hero = Hero()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_game)

        val surfaceView = findViewById<SurfaceView>(R.id.sv_canvas)
        surfaceView.setZOrderOnTop(true)
        surfaceView.holder.setFormat(PixelFormat.TRANSPARENT)

        val canvas = surfaceView.holder.lockCanvas()
        canvas?.let {
            hero.draw(canvas)
        }

    }
}
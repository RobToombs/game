package toombs.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val continuous = findViewById<Button>(R.id.continuous)
        continuous.setOnClickListener {
            val intent = Intent(this, Game::class.java)
            startActivity(intent)
        }
    }
}

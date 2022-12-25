package com.syafei.ticketingapps

import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val seatsView = findViewById<SeatsView>(R.id.seatsView)
        val button = findViewById<Button>(R.id.finishButton)

        button.setOnClickListener {
            seatsView.seat?.let {
                Toast.makeText(this@MainActivity, "Kursi anda no ${it.name}", Toast.LENGTH_SHORT)
                    .show()
            } ?: run {
                Toast.makeText(
                    this@MainActivity,
                    "silahkan pilih kursi terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
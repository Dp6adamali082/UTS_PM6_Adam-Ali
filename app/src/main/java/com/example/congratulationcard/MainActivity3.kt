package com.example.congratulationcard

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // Menghubungkan TextView dari layout
        val nameDisplay = findViewById<TextView>(R.id.nameDisplay)
        val messageDisplay = findViewById<TextView>(R.id.messageDisplay)

        // Mengambil data dari Intent
        val nama = intent.getStringExtra("NAMA") ?: "Nama tidak tersedia"
        val pesan = intent.getStringExtra("PESAN") ?: "Pesan tidak tersedia"

        // Menampilkan data pada TextView
        nameDisplay.text = nama
        messageDisplay.text = pesan
    }
}

package com.example.congratulationcard

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    // Deklarasi variabel untuk komponen UI
    private lateinit var titleTextView: TextView
    private lateinit var nama1EditText: EditText
    private lateinit var nama2EditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Pastikan layout ini sesuai

        // Menghubungkan variabel dengan komponen UI
        titleTextView = findViewById(R.id.Title)
        nama1EditText = findViewById(R.id.nama1)
        nama2EditText = findViewById(R.id.nama2)
        submitButton = findViewById(R.id.button)

        // Menangani klik pada button
        submitButton.setOnClickListener {
            // Mendapatkan teks dari EditText
            val nama = nama1EditText.text.toString()
            val pesan = nama2EditText.text.toString()

            // Menampilkan Toast dengan nama dan pesan
            Toast.makeText(this, "Nama: $nama\nPesan: $pesan", Toast.LENGTH_LONG).show()
        }
    }
}

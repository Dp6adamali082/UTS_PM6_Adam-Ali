package com.example.congratulationcard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private lateinit var nama1EditText: EditText
    private lateinit var nama2EditText: EditText
    private lateinit var buttonNavigate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Menghubungkan EditText dan Button dari layout
        nama1EditText = findViewById(R.id.nama1)
        nama2EditText = findViewById(R.id.nama2)
        buttonNavigate = findViewById(R.id.button)

        // Menangani klik pada tombol untuk berpindah ke MainActivity3
        buttonNavigate.setOnClickListener {
            val nama = nama1EditText.text.toString()
            val pesan = nama2EditText.text.toString()

            // Memastikan bahwa nama dan pesan tidak kosong
            if (nama.isNotEmpty() && pesan.isNotEmpty()) {
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("NAMA", nama)
                intent.putExtra("PESAN", pesan)

                startActivity(intent)
            } else {
                // Menampilkan pesan kesalahan jika nama atau pesan kosong
                if (nama.isEmpty()) {
                    nama1EditText.error = "Nama tidak boleh kosong"
                }
                if (pesan.isEmpty()) {
                    nama2EditText.error = "Pesan tidak boleh kosong"
                }
            }
        }
    }
}

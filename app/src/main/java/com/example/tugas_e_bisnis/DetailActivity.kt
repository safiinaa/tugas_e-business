package com.example.tugas_e_bisnis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_e_bisnis.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null){
            val nama = intent.getStringExtra("nama")
            val deskripsi = intent.getIntExtra("detail", R.string.Kripca)
            val image = intent.getIntExtra("image", R.drawable.kripca)

            binding.DetailHome.text = nama
            binding.deskripsi.setText(deskripsi)
            binding.detailImage.setImageResource(image)
        }
    }
}
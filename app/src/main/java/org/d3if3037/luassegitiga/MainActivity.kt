package org.d3if3037.luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import org.d3if3037.luassegitiga.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.button.setOnClickListener { luasSegitiga()}
}
    private fun luasSegitiga(){
        val alas = binding.inputAlas.text.toString()
        if (TextUtils.isEmpty( alas )) {
            Toast.makeText(this, R.string.alas_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val tinggi = binding.inputTinggi.text.toString()
        if (TextUtils.isEmpty( tinggi )) {
            Toast.makeText(this, R.string.tinggi_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val hasil = (alas.toFloat() * tinggi.toFloat()) / 2
        binding.hasilTextView.text = getString(R.string.luas_x, hasil)
}
}
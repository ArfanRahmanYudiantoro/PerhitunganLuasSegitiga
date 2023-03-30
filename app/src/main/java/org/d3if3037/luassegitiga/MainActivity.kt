package org.d3if3037.luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import org.d3if3037.luassegitiga.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  binding= ActivityMainBinding.inflate(layoutInflater)
setContentView(binding.root)
binding.button.setOnClickListener { luasSegitiga()}
}
private fun luasSegitiga(){
    val alas = binding.editTextNumber.text.toString().toInt()
    val tinggi = binding.editTextNumber2.text.toString().toInt()
    val hasil = (alas * tinggi) / 2

}
}
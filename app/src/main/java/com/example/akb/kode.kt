package com.example.akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_kode.*

class kode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode)

        next.setOnClickListener(){
            val kode_keluarga = klg.text.toString()
            if(kode_keluarga.isEmpty()){
                klg.setError("Kode Keluarga tidak boleh kosong")
            }
            else if(kode_keluarga.length < 6){
                klg.setError("Kode Keluarga minimal 6 karakter")
            }
            else{
                val intent = Intent( this,nama::class.java)
                startActivity(intent)
            }
        }
    }
}

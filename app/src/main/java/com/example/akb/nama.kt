package com.example.akb

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_nama.*

class nama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nama)

        next3.setOnClickListener(){
            val nama = name2.text.toString()
            val umur =age.text.toString()
            if(nama.isEmpty()){
                name2.setError("Nama tidak boleh kosong")
            }
            else if(umur.isEmpty()){
                age.setError("Umur tidak boleh kosong")
            }
            else {
                val intent = Intent(this, end::class.java)
                    .putExtra(EXTRA_MESSAGE, nama)
                startActivity(intent)
            }
        }
    }
}

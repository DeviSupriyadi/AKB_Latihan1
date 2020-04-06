package com.example.akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

/* Tanggal Penggerjaan  :
 * NIM                  :
 * Nama                 :
 * Kelas                :
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mulai.setOnClickListener(){
            val intent = Intent( this, kode::class.java)
            startActivity(intent)
        }
    }
}

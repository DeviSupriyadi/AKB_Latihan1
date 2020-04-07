package com.example.akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

/* Tanggal Penggerjaan  : 3-4 April 2020, 6-7 April 2020
 * NIM                  : 10117181
 * Nama                 : Devi Tiana Octaviani S
 * Kelas                : IF-5
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

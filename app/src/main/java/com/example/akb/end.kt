package com.example.akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_end.*
import android.content.Intent

class end : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val name2 = intent.getStringExtra(EXTRA_MESSAGE)
        wididid.setText(
            "Beres! Sekarang "+ name2 +" udah bisa ngecek penggunaan HP mu tiap hari buat " +
                    "bantu kamu ngatur waktu:)"
        )

        exit.setOnClickListener(){
            val intent = Intent( this,MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}

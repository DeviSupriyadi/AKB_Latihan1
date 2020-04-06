package com.example.akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_end.*

class end : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val nama = intent.getStringExtra(EXTRA_MESSAGE)
        wididid.setText(
            "Beres! Sekarang "+nama +" udah bisa ngecek penggunaan HP mu tiap hari buat " +
                    "bantu kamu ngatur waktu:)"
        )
    }
}

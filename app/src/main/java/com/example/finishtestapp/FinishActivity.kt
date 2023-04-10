package com.example.finishtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        Toast.makeText(this, "3초뒤 종료됩니다.", Toast.LENGTH_SHORT).show()

        val handler = Handler(Looper.getMainLooper())
        val finishRunnable = Runnable {
            finishAndRemoveTask()
        }

        handler.postDelayed(finishRunnable, 3000)
    }
}
package com.ke.hilt_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    companion object{
        const val EXTRA_KEY_UUID = "EXTRA_KEY_UUID"
    }
}
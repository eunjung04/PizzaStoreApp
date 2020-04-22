package com.example.pizzastoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pizzastoreapp.datas.Store

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValue()
    }

    override fun setupEvents() {

    }


    override fun setValue() {

        // val tempStore=Store("피자헛","naver.com", phoneNum = "1")
       // Log.d("가게이름", tempStore.name)

    }



}

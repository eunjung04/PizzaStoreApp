package com.example.pizzastoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizzastoreapp.datas.Store

class Main2Activity : BaseActivity() {

    private
    override fun setupEvents() {

    }

    override fun setValue() {
        storeDate=intent.getSerializableExtra("storeDate") as Store
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}

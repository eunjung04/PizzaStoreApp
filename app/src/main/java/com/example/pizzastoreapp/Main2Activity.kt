package com.example.pizzastoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pizzastoreapp.datas.Store
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : BaseActivity() {

    private lateinit var storeData:Store

    private
    override fun setupEvents() {

    }

    override fun setValue() {
        storeData=intent.getSerializableExtra("storeDate") as Store


        storeNameTxt.text = storeData.name
        storePhoneTxt.text = storeData.phoneNum

        Glide.with(mContext).load(storeData.logoUrl).into(storeLogoImg)


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}

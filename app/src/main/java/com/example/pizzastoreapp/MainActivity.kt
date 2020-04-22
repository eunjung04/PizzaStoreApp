package com.example.pizzastoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pizzastoreapp.adapter.StoreAdapter
import com.example.pizzastoreapp.datas.Store
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

   private lateinit var mPizzaAdapter:StoreAdapter
    val pizzaStore=ArrayList<Store>()

    val mpa : StoreAdapter by lazy {
        StoreAdapter(mContext, R.layout.store_list_item,pizzaStore)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValue()
    }

    override fun setupEvents() {

        pizzaStoreListView

        pizzaStoreListView.adapter
        //pizzaStoreListView=mpa

    }


    override fun setValue() {
        addPizzaStore()
        mPizzaAdapter= StoreAdapter(mContext.R.layout.store_list_item)



    }

    fun addPizzaStore(){
        pizzaStore.add(Store("피자헛",  "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg,","1111-2222"))
        pizzaStore.add(Store("피피존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","2222-3333"))


    }



}

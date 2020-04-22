package com.example.pizzastoreapp.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.pizzastoreapp.datas.Store

class StoreAdapter(val context: Context, resId:Int, list:ArrayList<Store>) : ArrayAdapter<Store>(context,resId,list) {

    val mContext=context
    val mList=list
    val inf=LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val tempRow=convertView

      tempRow?.let {

      }.let {
          tempRow=inf.inflate(R.layout.store_list_item,null)

      }

        val row=tempRow!!

        storeNmaeTxt

        return row

    }
}
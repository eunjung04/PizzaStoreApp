package com.example.pizzastoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.pizzastoreapp.datas.Store
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.jar.Manifest

class Main2Activity : BaseActivity() {

    private lateinit var storeData:Store


    override fun setupEvents() {




        callToStoreBtn.setOnClickListener {
           //it 변수 화면 예시
           //it.visibility=View.GONE

            val pi=object  : PermissionListener {
                override fun onPermissionGranred()

            }

            TedPermission.with(mContext)
                .setPermissionListener(pi)
                .setDeniedMessage("통화 권한 설정을 해야 사용 가능합니다.[설정]")
                .setPermissions(Manifest.permission.CALL_PHONE)


        }

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

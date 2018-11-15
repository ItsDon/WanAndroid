package com.don.demo.kotlindemo

import android.content.Context
import android.content.pm.PackageManager
import android.databinding.DataBindingUtil
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.compat.R.id.async
import android.support.compat.R.id.text
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.don.demo.kotlindemo.databinding.ActivityMainBinding
import com.don.demo.kotlindemo.model.User
import com.squareup.picasso.Picasso
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding
    lateinit var userModel : User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        userModel = User("Don",23)
        mainBinding.userModel = userModel


        Handler().postDelayed(Runnable {userModel.name = "FFFFFF";
        userModel.age = 33
        mainBinding.userModel = userModel},5000)
    }

}

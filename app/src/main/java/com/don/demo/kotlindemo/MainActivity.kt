package com.don.demo.kotlindemo

import android.content.Context
import android.content.pm.PackageManager
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.compat.R.id.async
import android.support.compat.R.id.text
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        runOnUiThread(Runnable {  })

        fun sum(a:Int ,b : Int) = a + b
        println(sum(3,4))

        toast("Hello Kotlin")

        var imageView : ImageView? = null
        imageView?.loadUrl("http:wwww.")


        val s = "Hello World"
        for (c in s){
            println(s.indexOf(c))
        }

        val textview  : TextView? = null
        textview as ImageView




    }


    fun Context.toast(text : String){
        Toast.makeText(this,text,Toast.LENGTH_LONG).show()
    }

    fun ImageView.loadUrl(url : String){
        Picasso.get().load(url).into(this)
    }

    interface BasicData{
        val email : String
        val name : String
        get() = email.substringBefore("@")
    }

    val retrofit by lazy{
        Retrofit.Builder().baseUrl("")
            .addConverterFactory(null)
            .build()

    }

    /**
     * Return app version name.
     *
     * @param context
     * @return
     */
    fun getAppVersion(context: Context): String {
        val pm = context.packageManager
        var version = ""
        try {
            val pi = pm.getPackageInfo(context.packageName, 0)
            version = pi.versionName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }

        return version

    }



}

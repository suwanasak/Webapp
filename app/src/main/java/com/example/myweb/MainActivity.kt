package com.example.myweb

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    var openLinkButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "http://192.168.1.69:2020/as+/"

        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
        val builder = CustomTabsIntent.Builder()
        // set toolbar color and/or setting custom actions before invoking build()
        builder.setToolbarColor(ContextCompat.getColor(this, R.color.colorRed))
        builder.addDefaultShareMenuItem()
        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
        val customTabsIntent = builder.build()
        // and launch the desired Url with CustomTabsIntent.launchUrl()
        customTabsIntent.launchUrl(this, Uri.parse(url))

//        openLinkButton = findViewById(R.id.open_button)
//        val url = "http://192.168.137.1/as+/"
//        openLinkButton?.setOnClickListener(View.OnClickListener { openCustomTab(url) })
    }

//    fun openCustomTab(url: String?) {
//        // Use a CustomTabsIntent.Builder to configure CustomTabsIntent.
//        val builder = CustomTabsIntent.Builder()
//        // set toolbar color and/or setting custom actions before invoking build()
//        builder.setToolbarColor(ContextCompat.getColor(this, R.color.colorRed))
//        builder.addDefaultShareMenuItem()
//        // Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
//        val customTabsIntent = builder.build()
//        // and launch the desired Url with CustomTabsIntent.launchUrl()
//        customTabsIntent.launchUrl(this, Uri.parse(url))
//    }
}
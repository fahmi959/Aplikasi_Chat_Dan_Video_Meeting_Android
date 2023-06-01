package com.capstonebangkit.aplikasi_fahmi_chat.FungsiMeeting.Common

import android.app.Application
import live.videosdk.rtc.android.VideoSDK
import com.androidnetworking.AndroidNetworking

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        VideoSDK.initialize(applicationContext)
        AndroidNetworking.initialize(applicationContext)
    }
}
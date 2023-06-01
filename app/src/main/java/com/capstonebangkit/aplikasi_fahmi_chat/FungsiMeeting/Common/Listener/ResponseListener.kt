package com.capstonebangkit.aplikasi_fahmi_chat.FungsiMeeting.Common.Listener

interface ResponseListener<T> {
    fun onResponse(response: T?)
}
package com.example.wetheronline.api

import android.provider.Telephony.MmsSms.PendingMessages

sealed class NetworkResponse<out  T> {
    data class Success<out T>(val data : T) : NetworkResponse<T>()
    data class Error(val messages: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}
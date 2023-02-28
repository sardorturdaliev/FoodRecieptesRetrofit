package com.sardordev.foodreciepts.utils

sealed class ResourseUI<T>(data: T?, message: String? = null) {

    data class Success<T>(val data: T?) : ResourseUI<T>(data)
    data class Error<T>(val data: T? = null, val message: String?) : ResourseUI<T>(data, message)

}

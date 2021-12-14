package com.ke.hilt_test

import android.content.Context

interface LoginService {

    fun login(account: String, password: String): Boolean
}

class QQLoginService constructor(private val stringUtil: StringUtil,private val context: Context) : LoginService {
    override fun login(account: String, password: String): Boolean {
        return true
    }
}

class WechatLoginService constructor(private val stringUtil: StringUtil,private val context: Context) : LoginService {

    override fun login(account: String, password: String): Boolean {
        return true
    }
}
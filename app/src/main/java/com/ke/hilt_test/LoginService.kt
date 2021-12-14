package com.ke.hilt_test

interface LoginService {

    fun login(account: String, password: String): Boolean
}

class QQLoginService : LoginService {
    override fun login(account: String, password: String): Boolean {
        return true
    }
}

class WechatLoginService : LoginService {

    override fun login(account: String, password: String): Boolean {
        return true
    }
}
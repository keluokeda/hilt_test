package com.ke.hilt_test

interface RegisterService {

    /**
     * 注册
     */
    fun register(account: String, password: String): Boolean
}

class RegisterServiceImpl : RegisterService {
    override fun register(account: String, password: String): Boolean {
        return account == password
    }

}
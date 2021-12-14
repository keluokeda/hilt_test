package com.ke.wechat

interface WechatShareService {

    fun share(title: String, link: String)
}

class WechatShareServiceImpl : WechatShareService {

    override fun share(title: String, link: String) {

    }
}
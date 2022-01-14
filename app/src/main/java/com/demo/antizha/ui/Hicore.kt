package com.demo.antizha.ui

import android.app.Application
import android.content.Context

class Hicore: Application() {
    companion object {
        var  _context:Application? = null
        fun getContext(): Context {
            return _context!!
        }
    }
    override fun onCreate() {
        super.onCreate()
        _context = this
    }
}
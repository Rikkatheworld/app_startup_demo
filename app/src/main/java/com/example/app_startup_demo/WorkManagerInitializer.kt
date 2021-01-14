package com.example.app_startup_demo

import android.content.Context
import androidx.startup.Initializer
import androidx.work.Configuration
import androidx.work.WorkManager

class WorkManagerInitializer : Initializer<Unit> {
    override fun create(context: Context) {

        // Initialize WorkManager with the default configuration.
        WorkManager.initialize(context, Configuration.Builder().build())
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }

}
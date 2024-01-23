package com.sample.salesforcetest

import android.app.Application
import com.salesforce.androidsdk.mobilesync.app.MobileSyncSDKManager

class BaseApplication : Application() {
    companion object {
        private const val FEATURE_APP_USES_KOTLIN = "KT"
    }

    override fun onCreate() {
        super.onCreate()

        MobileSyncSDKManager.initNative(applicationContext, MainActivity::class.java)
        MobileSyncSDKManager.getInstance().registerUsedAppFeature(FEATURE_APP_USES_KOTLIN)
        MobileSyncSDKManager.setAiltnAppName(getString(R.string.app_name))
    }
}
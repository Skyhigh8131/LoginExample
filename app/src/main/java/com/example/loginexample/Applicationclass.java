package com.example.loginexample;

import android.app.Application;

import com.onesignal.OneSignal;

public class Applicationclass extends Application {
    private static final String ONESIGNAL_APP_ID = "########-####-####-####-############";

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: Add OneSignal initialization here
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}

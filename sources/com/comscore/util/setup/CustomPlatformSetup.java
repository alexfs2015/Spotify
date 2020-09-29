package com.comscore.util.setup;

import com.comscore.android.util.jni.AndroidJniHelper;
import com.comscore.android.util.log.AndroidLogger;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.LogHelper;

public class CustomPlatformSetup extends PlatformSetup {
    private static final String a = "5.7.4.190904b";

    public JniComScoreHelper createApplicationInfoHelper() {
        return new AndroidJniHelper();
    }

    public LogHelper createLogger() {
        return new AndroidLogger();
    }

    public String getJavaCodeVersion() {
        return a;
    }
}

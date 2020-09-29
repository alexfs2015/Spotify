package com.crashlytics.android.ndk;

import android.content.res.AssetManager;

public class JniNativeApi implements ajr {
    private native boolean nativeInit(String str, Object obj);

    static {
        System.loadLibrary("crashlytics");
    }

    public final boolean a(String str, AssetManager assetManager) {
        return nativeInit(str, assetManager);
    }
}

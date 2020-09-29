package com.crashlytics.android.ndk;

import android.content.res.AssetManager;

public class JniNativeApi implements akf {
    static {
        System.loadLibrary("crashlytics");
    }

    private native boolean nativeInit(String str, Object obj);

    public final boolean a(String str, AssetManager assetManager) {
        return nativeInit(str, assetManager);
    }
}

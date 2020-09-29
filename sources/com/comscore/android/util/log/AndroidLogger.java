package com.comscore.android.util.log;

import android.util.Log;
import com.comscore.util.log.LogHelper;

public class AndroidLogger implements LogHelper {
    public static final String TAG = "COMSCORE";

    public void d(String str) {
    }

    public void d(String str, String str2) {
    }

    public void e(String str) {
        Log.e(TAG, str);
    }

    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    public void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public void e(String str, Throwable th) {
        Log.e(TAG, str, th);
    }

    public void i(String str) {
    }

    public void i(String str, String str2) {
    }

    public void w(String str) {
    }

    public void w(String str, String str2) {
    }
}

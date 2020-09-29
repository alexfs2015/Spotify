package com.comscore.android.id;

import android.os.Build;
import android.os.Build.VERSION;

class a {
    a() {
    }

    static String a() {
        if (VERSION.SDK_INT >= 9) {
            return Build.SERIAL;
        }
        return null;
    }
}

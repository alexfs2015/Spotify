package defpackage;

import android.app.ActivityManager;
import android.os.Build.VERSION;

/* renamed from: fa reason: default package */
public final class fa {
    public static boolean a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}

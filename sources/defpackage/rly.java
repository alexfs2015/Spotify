package defpackage;

import android.app.ActivityManager;
import android.os.Process;

/* renamed from: rly reason: default package */
public final class rly extends rle {
    private final ActivityManager a;
    private final int b = Process.myUid();

    public rly(ActivityManager activityManager) {
        this.a = activityManager;
    }
}

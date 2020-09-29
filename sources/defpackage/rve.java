package defpackage;

import android.app.ActivityManager;
import android.os.Process;

/* renamed from: rve reason: default package */
public final class rve extends ruk {
    private final ActivityManager a;
    private final int b = Process.myUid();

    public rve(ActivityManager activityManager) {
        this.a = activityManager;
    }
}

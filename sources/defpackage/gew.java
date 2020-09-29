package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

/* renamed from: gew reason: default package */
public final class gew {
    final Context a;

    public gew(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.samsung.android.mobileservice", 0);
            return (VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode) >= 1050000023;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}

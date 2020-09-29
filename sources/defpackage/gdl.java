package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

/* renamed from: gdl reason: default package */
public final class gdl {
    final Context a;

    public gdl(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        long j;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.samsung.android.mobileservice", 0);
            if (VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = (long) packageInfo.versionCode;
            }
            if (j >= 1050000023) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}

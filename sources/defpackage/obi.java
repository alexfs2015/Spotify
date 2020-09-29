package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: obi reason: default package */
public final class obi {
    private final Context a;

    public obi(Context context) {
        this.a = context;
    }

    public final boolean a(String str) {
        for (PackageInfo packageInfo : this.a.getPackageManager().getInstalledPackages(0)) {
            if (str.equals(packageInfo.packageName)) {
                return true;
            }
        }
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: nuv reason: default package */
public final class nuv {
    private final Context a;

    public nuv(Context context) {
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

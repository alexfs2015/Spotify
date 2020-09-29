package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: bzf reason: default package */
public final class bzf {
    public static PackageInfo a(Context context, String str) {
        try {
            return cab.a(context).b(str, 128);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean b(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((cab.a(context).a(str, 0).flags & 2097152) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}

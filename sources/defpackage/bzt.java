package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: bzt reason: default package */
public final class bzt {
    public static boolean a(Context context, int i) {
        String str = "com.google.android.gms";
        if (!a(context, i, str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            bsa a = bsa.a(context);
            if (packageInfo != null) {
                if (bsa.a(packageInfo, false)) {
                    return true;
                }
                if (!bsa.a(packageInfo, true) || !brz.honorsDebugCertificates(a.a)) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    public static boolean a(Context context, int i, String str) {
        return cab.a(context).a(i, str);
    }
}

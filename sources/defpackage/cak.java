package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: cak reason: default package */
public final class cak {
    public static boolean a(Context context, int i) {
        String str = "com.google.android.gms";
        if (!a(context, i, str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            bsr a = bsr.a(context);
            if (packageInfo != null) {
                if (bsr.a(packageInfo, false)) {
                    return true;
                }
                return bsr.a(packageInfo, true) && bsq.honorsDebugCertificates(a.a);
            }
        } catch (NameNotFoundException unused) {
            Log.isLoggable("UidVerifier", 3);
            return false;
        }
    }

    public static boolean a(Context context, int i, String str) {
        return cas.a(context).a(i, str);
    }
}

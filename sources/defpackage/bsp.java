package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: bsp reason: default package */
public class bsp {
    private static final bsp a = new bsp();
    public static final int b = bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    bsp() {
    }

    private static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(b);
        String str2 = "-";
        sb.append(str2);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(str2);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(str2);
        if (context != null) {
            try {
                sb.append(cas.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public static bsp b() {
        return a;
    }

    public static void c(Context context) {
        bsq.cancelAvailabilityErrorNotifications(context);
    }

    public static boolean c(Context context, int i) {
        return bsq.isPlayServicesPossiblyUpdating(context, i);
    }

    public static int d(Context context) {
        return bsq.getApkVersion(context);
    }

    public int a(Context context) {
        return b(context, b);
    }

    public PendingIntent a(Context context, int i, int i2) {
        return a(context, i, i2, null);
    }

    public final PendingIntent a(Context context, int i, int i2, String str) {
        Intent a2 = a(context, i, str);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a2, 134217728);
    }

    public Intent a(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        if (i == 1 || i == 2) {
            return (context == null || !cab.b(context)) ? bzf.a(str2, a(context, str)) : bzf.a();
        }
        if (i != 3) {
            return null;
        }
        return bzf.a(str2);
    }

    public boolean a(int i) {
        return bsq.isUserRecoverableError(i);
    }

    public int b(Context context, int i) {
        int isGooglePlayServicesAvailable = bsq.isGooglePlayServicesAvailable(context, i);
        if (bsq.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    public String b(int i) {
        return bsq.getErrorString(i);
    }
}

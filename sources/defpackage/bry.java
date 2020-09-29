package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: bry reason: default package */
public class bry {
    private static final bry a = new bry();
    public static final int b = brz.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static bry b() {
        return a;
    }

    bry() {
    }

    public int a(Context context) {
        return b(context, b);
    }

    public int b(Context context, int i) {
        int isGooglePlayServicesAvailable = brz.isGooglePlayServicesAvailable(context, i);
        if (brz.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    public boolean a(int i) {
        return brz.isUserRecoverableError(i);
    }

    public Intent a(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        if (i == 1 || i == 2) {
            if (context == null || !bzk.b(context)) {
                return byo.a(str2, a(context, str));
            }
            return byo.a();
        } else if (i != 3) {
            return null;
        } else {
            return byo.a(str2);
        }
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

    public static void c(Context context) {
        brz.cancelAvailabilityErrorNotifications(context);
    }

    public static int d(Context context) {
        return brz.getApkVersion(context);
    }

    public static boolean c(Context context, int i) {
        return brz.isPlayServicesPossiblyUpdating(context, i);
    }

    public String b(int i) {
        return brz.getErrorString(i);
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
                sb.append(cab.a(context).b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }
}

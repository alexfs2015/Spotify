package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bsq reason: default package */
public class bsq {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static boolean zzag;
    private static boolean zzah;
    private static boolean zzai;
    private static boolean zzaj;
    private static final AtomicBoolean zzak = new AtomicBoolean();

    protected bsq() {
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzak.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) {
        int b = bsp.b().b(context, i);
        if (b != 0) {
            Intent a = bsp.b().a(context, b, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(b);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a == null) {
                throw new GooglePlayServicesNotAvailableException(b);
            }
            throw new GooglePlayServicesRepairableException(b, "Google Play Services not available", a);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        return 0;
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        return 0;
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return bsp.b().a(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.a(i);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return bsp.b().a((Context) null, i, (String) null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zzaj) {
            try {
                PackageInfo b = cas.a(context).b("com.google.android.gms", 64);
                bsr.a(context);
                if (b == null || bsr.a(b, false) || !bsr.a(b, true)) {
                    zzai = false;
                } else {
                    zzai = true;
                }
            } catch (NameNotFoundException unused) {
            } finally {
                zzaj = true;
            }
        }
        if (!zzai) {
            return !"user".equals(Build.TYPE);
        }
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return 0;
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return 0;
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return cak.a(context, i);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return isUninstalledAppPossiblyUpdating(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context context) {
        if (caf.d()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null) {
                if ("true".equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return cab.c(context);
    }

    static boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (caf.g()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (NameNotFoundException unused2) {
        }
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return cak.a(context, i, str);
    }

    private static int zza(Context context, boolean z, int i) {
        String str = "com.google.android.gms";
        bxo.b(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            bsr.a(context);
            if (!bsr.a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!bsr.a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (cao.a(packageInfo2.versionCode) < cao.a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo(str, 0);
                } catch (NameNotFoundException unused2) {
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException unused3) {
            return 1;
        }
    }
}

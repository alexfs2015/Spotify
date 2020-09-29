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

/* renamed from: brz reason: default package */
public class brz {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static boolean zzag = false;
    private static boolean zzah = false;
    private static boolean zzai = false;
    private static boolean zzaj = false;
    private static final AtomicBoolean zzak = new AtomicBoolean();

    public static void enableUsingApkIndependentContext() {
        zzak.set(true);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    protected brz() {
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.a(i);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (defpackage.bzk.a.booleanValue() == false) goto L_0x0097;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int isGooglePlayServicesAvailable(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ all -> 0x000b }
            r1 = 2131952002(0x7f130182, float:1.9540434E38)
            r0.getString(r1)     // Catch:{ all -> 0x000b }
            goto L_0x0012
        L_0x000b:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0012:
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005f
            java.util.concurrent.atomic.AtomicBoolean r0 = zzak
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x005f
            int r0 = defpackage.byx.b(r4)
            if (r0 == 0) goto L_0x0057
            int r1 = GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r0 != r1) goto L_0x0031
            goto L_0x005f
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 320(0x140, float:4.48E-43)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r5 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = " but found "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0057:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r4.<init>(r5)
            throw r4
        L_0x005f:
            boolean r0 = defpackage.bzk.b(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Boolean r0 = defpackage.bzk.a
            if (r0 != 0) goto L_0x008d
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x0086
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r0 = 0
            goto L_0x0087
        L_0x0086:
            r0 = 1
        L_0x0087:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.bzk.a = r0
        L_0x008d:
            java.lang.Boolean r0 = defpackage.bzk.a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            int r4 = zza(r4, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brz.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    private static int zza(Context context, boolean z, int i) {
        String str = "com.google.android.gms";
        bwx.b(i >= 0);
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
            bsa.a(context);
            if (!bsa.a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!bsa.a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (bzx.a(packageInfo2.versionCode) < bzx.a(i)) {
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
            if (!applicationInfo.enabled) {
                return 3;
            }
            return 0;
        } catch (NameNotFoundException unused3) {
            return 1;
        }
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) {
        int b = bry.b().b(context, i);
        if (b != 0) {
            Intent a = bry.b().a(context, b, "e");
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
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return bzt.a(context, i);
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return bzt.a(context, i, str);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return bry.b().a((Context) null, i, (String) null);
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zzaj) {
            try {
                PackageInfo b = cab.a(context).b("com.google.android.gms", 64);
                bsa.a(context);
                if (b == null || bsa.a(b, false) || !bsa.a(b, true)) {
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
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return bry.b().a(context, i, i2);
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

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        bwx.a(true);
        PackageInfo a = bzf.a(context, context.getPackageName());
        if (a == null || a.applicationInfo == null) {
            return -1;
        }
        Bundle bundle = a.applicationInfo.metaData;
        if (bundle == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return bzk.c(context);
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

    static boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (bzo.g()) {
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
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (NameNotFoundException unused2) {
        }
    }

    public static boolean isRestrictedUserProfile(Context context) {
        if (bzo.d()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null) {
                if ("true".equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
        }
        return false;
    }
}

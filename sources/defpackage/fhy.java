package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: fhy reason: default package */
public final class fhy {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());
    private final Context b;
    private Bundle c;

    public fhy(Context context) {
        this.b = context.getApplicationContext();
    }

    public static boolean a(Bundle bundle) {
        return "1".equals(a(bundle, "gcm.n.e")) || a(bundle, "gcm.n.icon") != null;
    }

    private static String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    private static Object[] b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_args";
        String a2 = a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a2);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return objArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = (str2.length() != 0 ? valueOf2.concat(str2) : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a2).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a2);
            sb.append("  Default value will be used.");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "gcm.n.noui"
            java.lang.String r2 = a(r1, r2)
            java.lang.String r3 = "1"
            boolean r2 = r3.equals(r2)
            r4 = 1
            if (r2 == 0) goto L_0x0014
            return r4
        L_0x0014:
            android.content.Context r2 = r0.b
            java.lang.String r5 = "keyguard"
            java.lang.Object r2 = r2.getSystemService(r5)
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2
            boolean r2 = r2.inKeyguardRestrictedInputMode()
            r5 = 0
            if (r2 != 0) goto L_0x0060
            boolean r2 = defpackage.bzo.g()
            if (r2 != 0) goto L_0x0030
            r6 = 10
            android.os.SystemClock.sleep(r6)
        L_0x0030:
            int r2 = android.os.Process.myPid()
            android.content.Context r6 = r0.b
            java.lang.String r7 = "activity"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L_0x0060
            java.util.Iterator r6 = r6.iterator()
        L_0x0048:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0060
            java.lang.Object r7 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7
            int r8 = r7.pid
            if (r8 != r2) goto L_0x0048
            int r2 = r7.importance
            r6 = 100
            if (r2 != r6) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x0064
            return r5
        L_0x0064:
            java.lang.String r2 = "gcm.n.title"
            java.lang.String r2 = r0.c(r1, r2)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0080
            android.content.Context r2 = r0.b
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            android.content.Context r6 = r0.b
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.CharSequence r2 = r2.loadLabel(r6)
        L_0x0080:
            java.lang.String r6 = "gcm.n.body"
            java.lang.String r6 = r0.c(r1, r6)
            java.lang.String r7 = "gcm.n.icon"
            java.lang.String r7 = a(r1, r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x00de
            android.content.Context r8 = r0.b
            android.content.res.Resources r8 = r8.getResources()
            android.content.Context r9 = r0.b
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r10 = "drawable"
            int r9 = r8.getIdentifier(r7, r10, r9)
            if (r9 == 0) goto L_0x00ad
            boolean r10 = r0.a(r9)
            if (r10 == 0) goto L_0x00ad
            goto L_0x0109
        L_0x00ad:
            android.content.Context r9 = r0.b
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r10 = "mipmap"
            int r9 = r8.getIdentifier(r7, r10, r9)
            if (r9 == 0) goto L_0x00c2
            boolean r8 = r0.a(r9)
            if (r8 == 0) goto L_0x00c2
            goto L_0x0109
        L_0x00c2:
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            int r8 = r8 + 61
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.String r8 = "Icon resource "
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = " not found. Notification will use default icon."
            r9.append(r7)
        L_0x00de:
            android.os.Bundle r7 = r16.a()
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_icon"
            int r7 = r7.getInt(r8, r5)
            if (r7 == 0) goto L_0x00f0
            boolean r8 = r0.a(r7)
            if (r8 != 0) goto L_0x00f8
        L_0x00f0:
            android.content.Context r7 = r0.b
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo()
            int r7 = r7.icon
        L_0x00f8:
            if (r7 == 0) goto L_0x0103
            boolean r8 = r0.a(r7)
            if (r8 != 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r9 = r7
            goto L_0x0109
        L_0x0103:
            r7 = 17301651(0x1080093, float:2.4979667E-38)
            r9 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0109:
            java.lang.String r7 = "gcm.n.color"
            java.lang.String r7 = a(r1, r7)
            java.lang.Integer r7 = r0.a(r7)
            java.lang.String r8 = "gcm.n.sound2"
            java.lang.String r8 = a(r1, r8)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L_0x0125
            java.lang.String r8 = "gcm.n.sound"
            java.lang.String r8 = a(r1, r8)
        L_0x0125:
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L_0x012d
            r8 = 0
            goto L_0x0185
        L_0x012d:
            java.lang.String r10 = "default"
            boolean r10 = r10.equals(r8)
            if (r10 != 0) goto L_0x0180
            android.content.Context r10 = r0.b
            android.content.res.Resources r10 = r10.getResources()
            android.content.Context r12 = r0.b
            java.lang.String r12 = r12.getPackageName()
            java.lang.String r13 = "raw"
            int r10 = r10.getIdentifier(r8, r13, r12)
            if (r10 == 0) goto L_0x0180
            android.content.Context r10 = r0.b
            java.lang.String r10 = r10.getPackageName()
            java.lang.String r12 = java.lang.String.valueOf(r10)
            int r12 = r12.length()
            int r12 = r12 + 24
            java.lang.String r13 = java.lang.String.valueOf(r8)
            int r13 = r13.length()
            int r12 = r12 + r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            java.lang.String r12 = "android.resource://"
            r13.append(r12)
            r13.append(r10)
            java.lang.String r10 = "/raw/"
            r13.append(r10)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L_0x0185
        L_0x0180:
            r8 = 2
            android.net.Uri r8 = android.media.RingtoneManager.getDefaultUri(r8)
        L_0x0185:
            java.lang.String r10 = "gcm.n.click_action"
            java.lang.String r10 = a(r1, r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L_0x01a5
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r10)
            android.content.Context r10 = r0.b
            java.lang.String r10 = r10.getPackageName()
            r12.setPackage(r10)
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r12.setFlags(r10)
            goto L_0x01e9
        L_0x01a5:
            java.lang.String r10 = "gcm.n.link_android"
            java.lang.String r10 = a(r1, r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L_0x01b7
            java.lang.String r10 = "gcm.n.link"
            java.lang.String r10 = a(r1, r10)
        L_0x01b7:
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L_0x01c2
            android.net.Uri r10 = android.net.Uri.parse(r10)
            goto L_0x01c3
        L_0x01c2:
            r10 = 0
        L_0x01c3:
            if (r10 == 0) goto L_0x01d9
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "android.intent.action.VIEW"
            r12.<init>(r13)
            android.content.Context r13 = r0.b
            java.lang.String r13 = r13.getPackageName()
            r12.setPackage(r13)
            r12.setData(r10)
            goto L_0x01e9
        L_0x01d9:
            android.content.Context r10 = r0.b
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            android.content.Context r12 = r0.b
            java.lang.String r12 = r12.getPackageName()
            android.content.Intent r12 = r10.getLaunchIntentForPackage(r12)
        L_0x01e9:
            if (r12 != 0) goto L_0x01ed
            r10 = 0
            goto L_0x0233
        L_0x01ed:
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r12.addFlags(r10)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r1)
            com.google.firebase.messaging.FirebaseMessagingService.a(r10)
            r12.putExtras(r10)
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0205:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0225
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "gcm.n."
            boolean r14 = r13.startsWith(r14)
            if (r14 != 0) goto L_0x0221
            java.lang.String r14 = "gcm.notification."
            boolean r14 = r13.startsWith(r14)
            if (r14 == 0) goto L_0x0205
        L_0x0221:
            r12.removeExtra(r13)
            goto L_0x0205
        L_0x0225:
            android.content.Context r10 = r0.b
            java.util.concurrent.atomic.AtomicInteger r13 = a
            int r13 = r13.incrementAndGet()
            r14 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r10, r13, r12, r14)
        L_0x0233:
            if (r1 != 0) goto L_0x0237
            r3 = 0
            goto L_0x0241
        L_0x0237:
            java.lang.String r12 = "google.c.a.e"
            java.lang.String r12 = r1.getString(r12)
            boolean r3 = r3.equals(r12)
        L_0x0241:
            if (r3 == 0) goto L_0x0275
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r12 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r3.<init>(r12)
            a(r3, r1)
            java.lang.String r12 = "pending_intent"
            r3.putExtra(r12, r10)
            android.content.Context r10 = r0.b
            java.util.concurrent.atomic.AtomicInteger r12 = a
            int r12 = r12.incrementAndGet()
            android.app.PendingIntent r10 = defpackage.fgo.a(r10, r12, r3)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r12 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r3.<init>(r12)
            a(r3, r1)
            android.content.Context r12 = r0.b
            java.util.concurrent.atomic.AtomicInteger r13 = a
            int r13 = r13.incrementAndGet()
            android.app.PendingIntent r3 = defpackage.fgo.a(r12, r13, r3)
            goto L_0x0276
        L_0x0275:
            r3 = 0
        L_0x0276:
            java.lang.String r12 = "gcm.n.android_channel_id"
            java.lang.String r12 = a(r1, r12)
            boolean r13 = defpackage.bzo.i()
            r14 = 3
            java.lang.String r15 = "fcm_fallback_notification_channel"
            if (r13 == 0) goto L_0x02f6
            android.content.Context r13 = r0.b
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo()
            int r13 = r13.targetSdkVersion
            r11 = 26
            if (r13 >= r11) goto L_0x0292
            goto L_0x02f6
        L_0x0292:
            android.content.Context r11 = r0.b
            java.lang.Class<android.app.NotificationManager> r13 = android.app.NotificationManager.class
            java.lang.Object r11 = r11.getSystemService(r13)
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x02c6
            android.app.NotificationChannel r13 = r11.getNotificationChannel(r12)
            if (r13 == 0) goto L_0x02aa
            r15 = r12
            goto L_0x02f7
        L_0x02aa:
            java.lang.String r13 = java.lang.String.valueOf(r12)
            int r13 = r13.length()
            int r13 = r13 + 122
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            java.lang.String r13 = "Notification Channel requested ("
            r5.append(r13)
            r5.append(r12)
            java.lang.String r12 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r5.append(r12)
        L_0x02c6:
            android.os.Bundle r5 = r16.a()
            java.lang.String r12 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r5 = r5.getString(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r5)
            if (r12 != 0) goto L_0x02de
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r5)
            if (r12 == 0) goto L_0x02de
            r15 = r5
            goto L_0x02f7
        L_0x02de:
            android.app.NotificationChannel r5 = r11.getNotificationChannel(r15)
            if (r5 != 0) goto L_0x02f7
            android.app.NotificationChannel r5 = new android.app.NotificationChannel
            android.content.Context r12 = r0.b
            r13 = 2131952567(0x7f1303b7, float:1.954158E38)
            java.lang.String r12 = r12.getString(r13)
            r5.<init>(r15, r12, r14)
            r11.createNotificationChannel(r5)
            goto L_0x02f7
        L_0x02f6:
            r15 = 0
        L_0x02f7:
            fi$c r5 = new fi$c
            android.content.Context r11 = r0.b
            r5.<init>(r11)
            fi$c r5 = r5.b(r4)
            fi$c r5 = r5.a(r9)
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L_0x030f
            r5.a(r2)
        L_0x030f:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L_0x0324
            r5.b(r6)
            fi$b r2 = new fi$b
            r2.<init>()
            fi$b r2 = r2.a(r6)
            r5.a(r2)
        L_0x0324:
            if (r7 == 0) goto L_0x032c
            int r2 = r7.intValue()
            r5.r = r2
        L_0x032c:
            if (r8 == 0) goto L_0x0354
            android.app.Notification r2 = r5.w
            r2.sound = r8
            android.app.Notification r2 = r5.w
            r6 = -1
            r2.audioStreamType = r6
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 21
            if (r2 < r6) goto L_0x0354
            android.app.Notification r2 = r5.w
            android.media.AudioAttributes$Builder r6 = new android.media.AudioAttributes$Builder
            r6.<init>()
            r7 = 4
            android.media.AudioAttributes$Builder r6 = r6.setContentType(r7)
            r7 = 5
            android.media.AudioAttributes$Builder r6 = r6.setUsage(r7)
            android.media.AudioAttributes r6 = r6.build()
            r2.audioAttributes = r6
        L_0x0354:
            if (r10 == 0) goto L_0x0358
            r5.f = r10
        L_0x0358:
            if (r3 == 0) goto L_0x035d
            r5.a(r3)
        L_0x035d:
            if (r15 == 0) goto L_0x0361
            r5.t = r15
        L_0x0361:
            android.app.Notification r2 = r5.b()
            java.lang.String r3 = "gcm.n.tag"
            java.lang.String r1 = a(r1, r3)
            java.lang.String r3 = "FirebaseMessaging"
            android.util.Log.isLoggable(r3, r14)
            android.content.Context r3 = r0.b
            java.lang.String r5 = "notification"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L_0x0397
            long r5 = android.os.SystemClock.uptimeMillis()
            r1 = 37
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            java.lang.String r1 = "FCM-Notification:"
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = r7.toString()
        L_0x0397:
            r5 = 0
            r3.notify(r1, r5, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhy.b(android.os.Bundle):boolean");
    }

    private final String c(Bundle bundle, String str) {
        String a2 = a(bundle, str);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String valueOf = String.valueOf(str);
        String str2 = "_loc_key";
        String a3 = a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        Resources resources = this.b.getResources();
        int identifier = resources.getIdentifier(a3, "string", this.b.getPackageName());
        String str3 = " Default value will be used.";
        if (identifier == 0) {
            String valueOf2 = String.valueOf(str);
            String substring = (str2.length() != 0 ? valueOf2.concat(str2) : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(a3).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(a3);
            sb.append(str3);
            return null;
        }
        Object[] b2 = b(bundle, str);
        if (b2 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, b2);
        } catch (MissingFormatArgumentException unused) {
            String arrays = Arrays.toString(b2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(a3);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(str3);
            return null;
        }
    }

    private final boolean a(int i) {
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.b.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (NotFoundException unused) {
            return false;
        }
    }

    private final Integer a(String str) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
            }
        }
        int i = a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(fr.c(this.b, i));
            } catch (NotFoundException unused2) {
            }
        }
        return null;
    }

    private static void a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    private final Bundle a() {
        Bundle bundle = this.c;
        if (bundle != null) {
            return bundle;
        }
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = this.b.getPackageManager().getApplicationInfo(this.b.getPackageName(), 128);
        } catch (NameNotFoundException unused) {
        }
        if (applicationInfo == null || applicationInfo.metaData == null) {
            return Bundle.EMPTY;
        }
        this.c = applicationInfo.metaData;
        return this.c;
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: cij reason: default package */
public final class cij {
    private String A;
    private boolean B;
    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private boolean u;
    private String v;
    private String w;
    private float x;
    private int y;
    private int z;

    public cij(Context context) {
        PackageManager packageManager = context.getPackageManager();
        a(context);
        b(context);
        c(context);
        Locale locale = Locale.getDefault();
        boolean z2 = true;
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        if (a(packageManager, "http://www.google.com") == null) {
            z2 = false;
        }
        this.r = z2;
        this.s = locale.getCountry();
        dqe.a();
        this.t = cpc.a();
        this.u = cab.c(context);
        this.v = locale.getLanguage();
        this.w = a(context, packageManager);
        this.A = d(context);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.x = displayMetrics.density;
                this.y = displayMetrics.widthPixels;
                this.z = displayMetrics.heightPixels;
            }
        }
    }

    public cij(Context context, cii cii) {
        context.getPackageManager();
        a(context);
        b(context);
        c(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.B = caf.a() && dub.a(context);
        this.q = cii.b;
        this.r = cii.c;
        this.s = cii.e;
        this.t = cii.f;
        this.u = cii.g;
        this.v = cii.j;
        this.w = cii.k;
        this.A = cii.l;
        this.x = cii.s;
        this.y = cii.t;
        this.z = cii.u;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            bkc.i().a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String a(Context context, PackageManager packageManager) {
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null) {
            return null;
        }
        ActivityInfo activityInfo = a2.activityInfo;
        if (activityInfo == null) {
            return null;
        }
        try {
            PackageInfo b2 = cas.a(context).b(activityInfo.packageName, 0);
            if (b2 != null) {
                int i2 = b2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (NameNotFoundException unused) {
        }
        return null;
    }

    private final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.a = audioManager.getMode();
                this.b = audioManager.isMusicActive();
                this.c = audioManager.isSpeakerphoneOn();
                this.d = audioManager.getStreamVolume(3);
                this.e = audioManager.getRingerMode();
                this.f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                bkc.i().a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.b = false;
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    private final void b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = telephonyManager.getNetworkOperator();
        this.i = telephonyManager.getNetworkType();
        this.j = telephonyManager.getPhoneType();
        this.h = -2;
        this.k = false;
        this.l = -1;
        bkc.e();
        if (cmu.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.h = activeNetworkInfo.getType();
                this.l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private final void c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z2 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z2 = true;
            }
            this.n = z2;
            return;
        }
        this.m = -1.0d;
        this.n = false;
    }

    private static String d(Context context) {
        try {
            PackageInfo b2 = cas.a(context).b("com.android.vending", 128);
            if (b2 != null) {
                int i2 = b2.versionCode;
                String str = b2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final cii a() {
        cii cii = new cii(this.a, this.q, this.r, this.g, this.s, this.t, this.u, this.b, this.c, this.v, this.w, this.A, this.d, this.h, this.i, this.j, this.e, this.f, this.x, this.y, this.z, this.m, this.n, this.k, this.l, this.o, this.B, this.p);
        return cii;
    }
}

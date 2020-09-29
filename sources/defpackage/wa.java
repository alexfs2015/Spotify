package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.comscore.BuildConfig;
import java.util.Date;
import java.util.Locale;

/* renamed from: wa reason: default package */
final class wa {
    String A;
    String B;
    private boolean C = false;
    String a;
    String b;
    Boolean c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    String m;
    String n;
    String o;
    String p;
    String q;
    String r;
    String s;
    String t;
    String u;
    String v;
    String w;
    String x;
    String y;
    String z;

    wa(Context context, String str) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        Locale a2 = xa.a(configuration);
        int i2 = configuration.screenLayout;
        context.getContentResolver();
        this.i = context.getPackageName();
        this.j = c(context);
        int i3 = i2 & 15;
        String str2 = null;
        String str3 = (i3 == 1 || i3 == 2) ? "phone" : (i3 == 3 || i3 == 4) ? "tablet" : null;
        this.k = str3;
        this.l = Build.MODEL;
        this.m = Build.MANUFACTURER;
        this.n = "android";
        this.o = VERSION.RELEASE;
        StringBuilder sb = new StringBuilder();
        sb.append(VERSION.SDK_INT);
        this.p = sb.toString();
        this.q = a2.getLanguage();
        this.r = a2.getCountry();
        String str4 = BuildConfig.FLAVOR;
        String str5 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : "xlarge" : "large" : str4 : "small";
        this.s = str5;
        int i4 = i2 & 48;
        String str6 = i4 != 16 ? i4 != 32 ? null : "long" : str4;
        this.t = str6;
        int i5 = displayMetrics.densityDpi;
        if (i5 != 0) {
            str2 = i5 < 140 ? "low" : i5 > 200 ? "high" : "medium";
        }
        this.u = str2;
        this.v = String.valueOf(displayMetrics.widthPixels);
        this.w = String.valueOf(displayMetrics.heightPixels);
        String str7 = "android4.17.0";
        if (str != null) {
            str7 = xa.a("%s@%s", str, str7);
        }
        this.h = str7;
        this.g = d(context);
        this.x = Build.DISPLAY;
        String[] b2 = xa.b();
        this.y = (b2 == null || b2.length == 0) ? xa.c() : b2[0];
        this.z = Build.ID;
        this.A = e(context);
        this.B = f(context);
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        return xa.b(str);
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        return xa.d(str.replaceAll(":", ""));
    }

    private static String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String d(Context context) {
        String str = "aid";
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{str}, null, null, null);
            if (query == null) {
                return null;
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(query.getColumnIndex(str));
            query.close();
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String e(Context context) {
        try {
            return xa.b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).firstInstallTime));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String f(Context context) {
        try {
            return xa.b.format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).lastUpdateTime));
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context) {
        this.b = null;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            try {
                this.a = wc.a(context).a;
                if (this.a != null) {
                    this.b = "service";
                    break;
                }
            } catch (Exception unused) {
            }
            this.a = xa.a(context);
            if (this.a != null) {
                this.b = "library";
                break;
            }
            i2++;
        }
        for (int i3 = 0; i3 < 3; i3++) {
            try {
                this.c = wc.a(context).b;
                if (this.c != null) {
                    return;
                }
            } catch (Exception unused2) {
            }
            this.c = xa.b(context);
            if (this.c != null) {
                break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(Context context) {
        if (!this.C) {
            if (!xa.a(context, "android.permission.ACCESS_WIFI_STATE")) {
                vv.a().d("Missing permission: ACCESS_WIFI_STATE", new Object[0]);
            }
            String c2 = xa.c(context);
            this.d = a(c2);
            this.e = b(c2);
            this.f = xa.d(context);
            this.C = true;
        }
    }
}

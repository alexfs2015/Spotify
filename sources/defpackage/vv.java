package defpackage;

import android.content.Context;
import com.adjust.sdk.BackoffStrategy;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: vv reason: default package */
public final class vv {
    private static wg a = null;
    private static wh b = null;
    private static we c = null;
    private static wd d = null;
    private static wf e = null;
    private static HttpsURLConnection f = null;
    private static wj g = null;
    private static long h = -1;
    private static long i = -1;
    private static long j = -1;
    private static long k = -1;
    private static BackoffStrategy l = null;
    private static BackoffStrategy m = null;
    private static long n = -1;
    private static String o = "https://app.adjust.com";
    private static String p = "https://gdpr.adjust.com";
    private static b q = null;
    private static boolean r = true;

    public static HttpsURLConnection a(URL url) {
        return (HttpsURLConnection) url.openConnection();
    }

    public static wd a(vt vtVar) {
        if (vtVar == null) {
            a().f("AdjustConfig missing", new Object[0]);
            return null;
        } else if (vtVar.a()) {
            return new vr(vtVar);
        } else {
            a().f("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        }
    }

    public static we a(wd wdVar, boolean z) {
        return new vy(wdVar, z);
    }

    public static wf a() {
        if (e == null) {
            e = new wm();
        }
        return e;
    }

    public static wg a(wd wdVar, Context context, boolean z) {
        return new wr(wdVar, context, z);
    }

    public static wh a(wd wdVar, wg wgVar) {
        return new wt(wdVar, wgVar);
    }

    public static long b() {
        long j2 = h;
        if (j2 == -1) {
            return 60000;
        }
        return j2;
    }

    public static wj b(wd wdVar, boolean z) {
        return new wv(wdVar, z);
    }

    public static long c() {
        long j2 = i;
        if (j2 == -1) {
            return 60000;
        }
        return j2;
    }

    public static long d() {
        long j2 = j;
        if (j2 == -1) {
            return 1800000;
        }
        return j2;
    }

    public static long e() {
        long j2 = k;
        if (j2 == -1) {
            return 1000;
        }
        return j2;
    }

    public static BackoffStrategy f() {
        return BackoffStrategy.SHORT_WAIT;
    }

    public static BackoffStrategy g() {
        return BackoffStrategy.LONG_WAIT;
    }

    public static long h() {
        long j2 = n;
        if (j2 == -1) {
            return 10000;
        }
        return j2;
    }

    public static String i() {
        String str = o;
        return str == null ? "https://app.adjust.com" : str;
    }

    public static String j() {
        String str = p;
        return str == null ? "https://gdpr.adjust.com" : str;
    }

    public static b k() {
        return new a();
    }

    public static boolean l() {
        return r;
    }
}

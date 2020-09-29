package defpackage;

import android.content.Context;
import com.adjust.sdk.BackoffStrategy;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: vh reason: default package */
public final class vh {
    private static vs a = null;
    private static vt b = null;
    private static vq c = null;
    private static vp d = null;
    private static vr e = null;
    private static HttpsURLConnection f = null;
    private static vv g = null;
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

    public static vs a(vp vpVar, Context context, boolean z) {
        return new wd(vpVar, context, z);
    }

    public static vt a(vp vpVar, vs vsVar) {
        return new wf(vpVar, vsVar);
    }

    public static vr a() {
        if (e == null) {
            e = new vy();
        }
        return e;
    }

    public static long b() {
        long j2 = h;
        if (j2 == -1) {
            return 60000;
        }
        return j2;
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

    public static vq a(vp vpVar, boolean z) {
        return new vk(vpVar, z);
    }

    public static HttpsURLConnection a(URL url) {
        return (HttpsURLConnection) url.openConnection();
    }

    public static vv b(vp vpVar, boolean z) {
        return new wh(vpVar, z);
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

    public static vp a(vf vfVar) {
        if (vfVar == null) {
            a().f("AdjustConfig missing", new Object[0]);
            return null;
        } else if (vfVar.a()) {
            return new vd(vfVar);
        } else {
            a().f("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        }
    }
}

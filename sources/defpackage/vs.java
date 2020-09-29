package defpackage;

import android.net.Uri;

/* renamed from: vs reason: default package */
public final class vs {
    private static vw a;

    public static synchronized vw a() {
        vw vwVar;
        synchronized (vs.class) {
            if (a == null) {
                a = new vw();
            }
            vwVar = a;
        }
        return vwVar;
    }

    @Deprecated
    public static void a(Uri uri) {
        vw a2 = a();
        if (a2.a(null)) {
            a2.a.a(uri, System.currentTimeMillis());
        }
    }

    public static void a(vu vuVar) {
        vw a2 = a();
        if (a2.a(null)) {
            a2.a.a(vuVar);
        }
    }

    public static void b() {
        vw a2 = a();
        if (a2.a(null)) {
            a2.a.e();
        }
    }

    public static void c() {
        vw a2 = a();
        if (a2.a(null)) {
            a2.a.f();
        }
    }
}

package defpackage;

import android.net.Uri;

/* renamed from: ve reason: default package */
public final class ve {
    private static vi a;

    public static synchronized vi a() {
        vi viVar;
        synchronized (ve.class) {
            if (a == null) {
                a = new vi();
            }
            viVar = a;
        }
        return viVar;
    }

    public static void a(vg vgVar) {
        vi a2 = a();
        if (a2.a(null)) {
            a2.a.a(vgVar);
        }
    }

    public static void b() {
        vi a2 = a();
        if (a2.a(null)) {
            a2.a.e();
        }
    }

    public static void c() {
        vi a2 = a();
        if (a2.a(null)) {
            a2.a.f();
        }
    }

    @Deprecated
    public static void a(Uri uri) {
        vi a2 = a();
        if (a2.a(null)) {
            a2.a.a(uri, System.currentTimeMillis());
        }
    }
}

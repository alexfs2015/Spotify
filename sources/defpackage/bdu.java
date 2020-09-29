package defpackage;

import android.os.Trace;

/* renamed from: bdu reason: default package */
public final class bdu {
    public static void a(String str) {
        if (bdw.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (bdw.a >= 18) {
            Trace.endSection();
        }
    }
}

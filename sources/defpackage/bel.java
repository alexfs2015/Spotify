package defpackage;

import android.os.Trace;

/* renamed from: bel reason: default package */
public final class bel {
    public static void a() {
        if (ben.a >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (ben.a >= 18) {
            Trace.beginSection(str);
        }
    }
}

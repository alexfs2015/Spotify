package defpackage;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: ha reason: default package */
public final class ha {
    public static void a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}

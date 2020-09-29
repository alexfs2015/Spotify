package defpackage;

import android.content.Context;

/* renamed from: cab reason: default package */
public final class cab {
    private static cab b = new cab();
    private caa a = null;

    private final synchronized caa b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new caa(context);
        }
        return this.a;
    }

    public static caa a(Context context) {
        return b.b(context);
    }
}

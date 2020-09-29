package defpackage;

import android.content.Context;

/* renamed from: cas reason: default package */
public final class cas {
    private static cas b = new cas();
    private car a = null;

    public static car a(Context context) {
        return b.b(context);
    }

    private final synchronized car b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new car(context);
        }
        return this.a;
    }
}

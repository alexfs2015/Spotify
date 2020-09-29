package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: nyx reason: default package */
public abstract class nyx {
    public abstract kko<Context, Drawable> a();

    public abstract int b();

    public static nyx a(kko<Context, Drawable> kko, int i) {
        return new nyp(kko, i);
    }
}

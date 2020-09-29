package defpackage;

import android.content.Context;
import android.widget.TextView;

/* renamed from: jqj reason: default package */
public final class jqj {
    public static fuj a(Context context, int i, int i2) {
        fqb.f();
        fuj a = fum.a(context, null);
        TextView b = a.b();
        TextView c = a.c();
        b.setSingleLine(false);
        b.setEllipsize(null);
        c.setSingleLine(false);
        c.setEllipsize(null);
        if (i != 0) {
            a.a((CharSequence) context.getString(i));
        }
        if (i2 != 0) {
            a.b((CharSequence) context.getString(i2));
        }
        return a;
    }
}

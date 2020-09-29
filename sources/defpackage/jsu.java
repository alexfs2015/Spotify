package defpackage;

import android.content.Context;
import android.widget.TextView;

/* renamed from: jsu reason: default package */
public final class jsu {
    public static fvd a(Context context, int i, int i2) {
        fqv.f();
        fvd a = fvg.a(context, null);
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

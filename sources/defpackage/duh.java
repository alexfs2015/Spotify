package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

@cfp
/* renamed from: duh reason: default package */
public final class duh extends dvs {
    private final Drawable a;
    private final Uri b;
    private final double c;

    public duh(Drawable drawable, Uri uri, double d) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
    }

    public final cbi a() {
        return cbj.a(this.a);
    }

    public final Uri b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }
}

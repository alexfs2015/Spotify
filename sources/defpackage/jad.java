package defpackage;

import android.content.Context;

/* renamed from: jad reason: default package */
public final class jad implements izr {
    private final Context a;
    private final iya b;

    public jad(Context context, iya iya) {
        this.a = context;
        this.b = iya;
    }

    public final boolean a(jbn jbn) {
        return this.b.a(this.a.getPackageManager());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: jcp reason: default package */
public final class jcp implements jcd {
    private final Context a;
    private final jal b;

    public jcp(Context context, jal jal) {
        this.a = context;
        this.b = jal;
    }

    public final boolean a(jdz jdz) {
        return this.b.a(this.a.getPackageManager());
    }
}

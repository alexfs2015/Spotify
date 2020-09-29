package defpackage;

import android.content.Context;

@cfp
/* renamed from: bkz reason: default package */
public final class bkz {
    public final csy a;
    public final crs b;
    public final clc c;
    public final doc d;

    private bkz(csy csy, crs crs, clc clc, doc doc) {
        this.a = csy;
        this.b = crs;
        this.c = clc;
        this.d = doc;
    }

    public static bkz a(Context context) {
        return new bkz(new csn(), new crz(), new ckw(new ckx()), new doc(context));
    }
}

package defpackage;

import android.content.Context;

/* renamed from: mys reason: default package */
public final class mys implements wig<Boolean> {
    private final wzi<Context> a;

    private mys(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static mys a(wzi<Context> wzi) {
        return new mys(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jvi.c((Context) this.a.get()));
    }
}

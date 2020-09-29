package defpackage;

import android.content.Context;

/* renamed from: qtm reason: default package */
public final class qtm implements wig<qtl> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<qra> c;

    private qtm(wzi<Context> wzi, wzi<a> wzi2, wzi<qra> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qtm a(wzi<Context> wzi, wzi<a> wzi2, wzi<qra> wzi3) {
        return new qtm(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qtl((Context) this.a.get(), (a) this.b.get(), (qra) this.c.get());
    }
}

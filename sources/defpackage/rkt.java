package defpackage;

import android.content.Context;

/* renamed from: rkt reason: default package */
public final class rkt implements wig<rks> {
    private final wzi<Context> a;
    private final wzi<kk> b;
    private final wzi<rlh> c;

    private rkt(wzi<Context> wzi, wzi<kk> wzi2, wzi<rlh> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rkt a(wzi<Context> wzi, wzi<kk> wzi2, wzi<rlh> wzi3) {
        return new rkt(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rks(this.a, this.b, this.c);
    }
}

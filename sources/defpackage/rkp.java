package defpackage;

import android.content.Context;

/* renamed from: rkp reason: default package */
public final class rkp implements wig<rko> {
    private final wzi<Context> a;
    private final wzi<kk> b;
    private final wzi<rlh> c;

    private rkp(wzi<Context> wzi, wzi<kk> wzi2, wzi<rlh> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rkp a(wzi<Context> wzi, wzi<kk> wzi2, wzi<rlh> wzi3) {
        return new rkp(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rko((Context) this.a.get(), (kk) this.b.get(), (rlh) this.c.get());
    }
}

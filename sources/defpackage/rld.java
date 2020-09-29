package defpackage;

import android.content.Context;

/* renamed from: rld reason: default package */
public final class rld implements wig<rlc> {
    private final wzi<Context> a;
    private final wzi<kk> b;
    private final wzi<rlh> c;

    private rld(wzi<Context> wzi, wzi<kk> wzi2, wzi<rlh> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rld a(wzi<Context> wzi, wzi<kk> wzi2, wzi<rlh> wzi3) {
        return new rld(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rlc((Context) this.a.get(), (kk) this.b.get(), (rlh) this.c.get());
    }
}

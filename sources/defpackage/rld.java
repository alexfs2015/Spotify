package defpackage;

import android.content.Context;

/* renamed from: rld reason: default package */
public final class rld implements vua<rlc> {
    private final wlc<Context> a;
    private final wlc<rmh> b;
    private final wlc<rmy> c;

    private rld(wlc<Context> wlc, wlc<rmh> wlc2, wlc<rmy> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rld a(wlc<Context> wlc, wlc<rmh> wlc2, wlc<rmy> wlc3) {
        return new rld(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rlc((Context) this.a.get(), (rmh) this.b.get(), (rmy) this.c.get());
    }
}

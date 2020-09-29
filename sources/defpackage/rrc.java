package defpackage;

import android.content.Context;

/* renamed from: rrc reason: default package */
public final class rrc implements vua<rrb> {
    private final wlc<rra> a;
    private final wlc<jsz> b;
    private final wlc<Context> c;

    private rrc(wlc<rra> wlc, wlc<jsz> wlc2, wlc<Context> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rrc a(wlc<rra> wlc, wlc<jsz> wlc2, wlc<Context> wlc3) {
        return new rrc(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rrb((rra) this.a.get(), (jsz) this.b.get(), (Context) this.c.get());
    }
}

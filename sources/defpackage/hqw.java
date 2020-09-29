package defpackage;

import android.content.Context;

/* renamed from: hqw reason: default package */
public final class hqw implements vua<hqv> {
    private final wlc<Context> a;
    private final wlc<kxz> b;
    private final wlc<hpi> c;
    private final wlc<hrl> d;

    private hqw(wlc<Context> wlc, wlc<kxz> wlc2, wlc<hpi> wlc3, wlc<hrl> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hqw a(wlc<Context> wlc, wlc<kxz> wlc2, wlc<hpi> wlc3, wlc<hrl> wlc4) {
        return new hqw(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hqv((Context) this.a.get(), (kxz) this.b.get(), (hpi) this.c.get(), (hrl) this.d.get());
    }
}

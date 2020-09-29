package defpackage;

import android.content.Context;

/* renamed from: hqn reason: default package */
public final class hqn implements vua<hqm> {
    private final wlc<Context> a;
    private final wlc<kxz> b;
    private final wlc<vea> c;

    private hqn(wlc<Context> wlc, wlc<kxz> wlc2, wlc<vea> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hqn a(wlc<Context> wlc, wlc<kxz> wlc2, wlc<vea> wlc3) {
        return new hqn(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hqm((Context) this.a.get(), (kxz) this.b.get(), (vea) this.c.get());
    }
}

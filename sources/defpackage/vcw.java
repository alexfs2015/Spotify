package defpackage;

import android.content.Context;

/* renamed from: vcw reason: default package */
public final class vcw implements vua<vcv> {
    private final wlc<vcu> a;
    private final wlc<Context> b;
    private final wlc<vcy> c;

    private vcw(wlc<vcu> wlc, wlc<Context> wlc2, wlc<vcy> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static vcw a(wlc<vcu> wlc, wlc<Context> wlc2, wlc<vcy> wlc3) {
        return new vcw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new vcv((vcu) this.a.get(), (Context) this.b.get(), (vcy) this.c.get());
    }
}

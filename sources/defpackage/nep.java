package defpackage;

import android.content.Context;

/* renamed from: nep reason: default package */
public final class nep implements vua<nem> {
    private final wlc<Context> a;
    private final wlc<String> b;
    private final wlc<rnf> c;

    private nep(wlc<Context> wlc, wlc<String> wlc2, wlc<rnf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nep a(wlc<Context> wlc, wlc<String> wlc2, wlc<rnf> wlc3) {
        return new nep(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nem((Context) this.a.get(), (String) this.b.get(), (rnf) this.c.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: kxr reason: default package */
public final class kxr implements vua<kxq> {
    private final wlc<Context> a;
    private final wlc<sih> b;
    private final wlc<fpt> c;

    private kxr(wlc<Context> wlc, wlc<sih> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kxr a(wlc<Context> wlc, wlc<sih> wlc2, wlc<fpt> wlc3) {
        return new kxr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kxq((Context) this.a.get(), (sih) this.b.get(), (fpt) this.c.get());
    }
}

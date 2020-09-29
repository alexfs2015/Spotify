package defpackage;

import android.content.Context;

/* renamed from: ndp reason: default package */
public final class ndp implements vua<ndk> {
    private final wlc<Context> a;
    private final wlc<String> b;
    private final wlc<rnf> c;
    private final wlc<String> d;
    private final wlc<Boolean> e;

    private ndp(wlc<Context> wlc, wlc<String> wlc2, wlc<rnf> wlc3, wlc<String> wlc4, wlc<Boolean> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static ndp a(wlc<Context> wlc, wlc<String> wlc2, wlc<rnf> wlc3, wlc<String> wlc4, wlc<Boolean> wlc5) {
        ndp ndp = new ndp(wlc, wlc2, wlc3, wlc4, wlc5);
        return ndp;
    }

    public final /* synthetic */ Object get() {
        ndk ndk = new ndk((Context) this.a.get(), (String) this.b.get(), (rnf) this.c.get(), (String) this.d.get(), ((Boolean) this.e.get()).booleanValue());
        return ndk;
    }
}

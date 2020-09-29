package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: jiw reason: default package */
public final class jiw implements vua<jiv> {
    private final wlc<ka> a;
    private final wlc<RxResolver> b;
    private final wlc<jsz> c;
    private final wlc<tcn> d;
    private final wlc<mbl> e;
    private final wlc<ify> f;

    private jiw(wlc<ka> wlc, wlc<RxResolver> wlc2, wlc<jsz> wlc3, wlc<tcn> wlc4, wlc<mbl> wlc5, wlc<ify> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static jiw a(wlc<ka> wlc, wlc<RxResolver> wlc2, wlc<jsz> wlc3, wlc<tcn> wlc4, wlc<mbl> wlc5, wlc<ify> wlc6) {
        jiw jiw = new jiw(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return jiw;
    }

    public final /* synthetic */ Object get() {
        jiv jiv = new jiv((ka) this.a.get(), (RxResolver) this.b.get(), (jsz) this.c.get(), (tcn) this.d.get(), (mbl) this.e.get(), (ify) this.f.get());
        return jiv;
    }
}

package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: gsz reason: default package */
public final class gsz implements vua<gsy> {
    private final wlc<RxResolver> a;
    private final wlc<wug> b;
    private final wlc<wug> c;

    private gsz(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<wug> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gsz a(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<wug> wlc3) {
        return new gsz(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gsy((RxResolver) this.a.get(), (wug) this.b.get(), (wug) this.c.get());
    }
}

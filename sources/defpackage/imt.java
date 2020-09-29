package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: imt reason: default package */
public final class imt implements vua<ims> {
    private final wlc<RxResolver> a;
    private final wlc<wug> b;
    private final wlc<wug> c;

    private imt(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<wug> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static imt a(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<wug> wlc3) {
        return new imt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ims((RxResolver) this.a.get(), (wug) this.b.get(), (wug) this.c.get());
    }
}

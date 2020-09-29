package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: imr reason: default package */
public final class imr implements vua<imq> {
    private final wlc<RxResolver> a;
    private final wlc<wug> b;
    private final wlc<wug> c;

    private imr(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<wug> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static imr a(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<wug> wlc3) {
        return new imr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new imq((RxResolver) this.a.get(), (wug) this.b.get(), (wug) this.c.get());
    }
}

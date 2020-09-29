package defpackage;

import com.spotify.music.libs.web.RxWebToken;

/* renamed from: hvx reason: default package */
public final class hvx implements vua<hvw> {
    private final wlc<RxWebToken> a;
    private final wlc<hec> b;
    private final wlc<jjf> c;
    private final wlc<jrp> d;
    private final wlc<gho> e;

    private hvx(wlc<RxWebToken> wlc, wlc<hec> wlc2, wlc<jjf> wlc3, wlc<jrp> wlc4, wlc<gho> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hvx a(wlc<RxWebToken> wlc, wlc<hec> wlc2, wlc<jjf> wlc3, wlc<jrp> wlc4, wlc<gho> wlc5) {
        hvx hvx = new hvx(wlc, wlc2, wlc3, wlc4, wlc5);
        return hvx;
    }

    public final /* synthetic */ Object get() {
        hvw hvw = new hvw((RxWebToken) this.a.get(), (hec) this.b.get(), (jjf) this.c.get(), (jrp) this.d.get(), (gho) this.e.get());
        return hvw;
    }
}

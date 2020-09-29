package defpackage;

import com.spotify.music.libs.web.RxWebToken;

/* renamed from: sng reason: default package */
public final class sng implements vua<snf> {
    private final wlc<ka> a;
    private final wlc<jix> b;
    private final wlc<jjb> c;
    private final wlc<jiv> d;
    private final wlc<sov> e;
    private final wlc<RxWebToken> f;
    private final wlc<mbl> g;

    private sng(wlc<ka> wlc, wlc<jix> wlc2, wlc<jjb> wlc3, wlc<jiv> wlc4, wlc<sov> wlc5, wlc<RxWebToken> wlc6, wlc<mbl> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static sng a(wlc<ka> wlc, wlc<jix> wlc2, wlc<jjb> wlc3, wlc<jiv> wlc4, wlc<sov> wlc5, wlc<RxWebToken> wlc6, wlc<mbl> wlc7) {
        sng sng = new sng(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return sng;
    }

    public final /* synthetic */ Object get() {
        snf snf = new snf(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        return snf;
    }
}

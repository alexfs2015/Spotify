package defpackage;

import io.reactivex.Scheduler;

/* renamed from: okv reason: default package */
public final class okv implements vua<oku> {
    private final wlc<Scheduler> a;
    private final wlc<oew> b;
    private final wlc<hck> c;
    private final wlc<kxz> d;
    private final wlc<opb> e;

    private okv(wlc<Scheduler> wlc, wlc<oew> wlc2, wlc<hck> wlc3, wlc<kxz> wlc4, wlc<opb> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static okv a(wlc<Scheduler> wlc, wlc<oew> wlc2, wlc<hck> wlc3, wlc<kxz> wlc4, wlc<opb> wlc5) {
        okv okv = new okv(wlc, wlc2, wlc3, wlc4, wlc5);
        return okv;
    }

    public final /* synthetic */ Object get() {
        oku oku = new oku(this.a, this.b, this.c, this.d, this.e);
        return oku;
    }
}

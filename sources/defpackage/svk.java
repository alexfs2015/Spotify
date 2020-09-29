package defpackage;

import android.content.Context;

/* renamed from: svk reason: default package */
public final class svk implements vua<svj> {
    private final wlc<uoc> a;
    private final wlc<fpt> b;
    private final wlc<Context> c;
    private final wlc<veu> d;

    private svk(wlc<uoc> wlc, wlc<fpt> wlc2, wlc<Context> wlc3, wlc<veu> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static svk a(wlc<uoc> wlc, wlc<fpt> wlc2, wlc<Context> wlc3, wlc<veu> wlc4) {
        return new svk(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new svj((uoc) this.a.get(), (fpt) this.b.get(), (Context) this.c.get(), (veu) this.d.get());
    }
}

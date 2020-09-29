package defpackage;

import android.content.res.Resources;

/* renamed from: myx reason: default package */
public final class myx implements vua<myw> {
    private final wlc<gur> a;
    private final wlc<gup> b;
    private final wlc<Resources> c;
    private final wlc<kqj> d;

    private myx(wlc<gur> wlc, wlc<gup> wlc2, wlc<Resources> wlc3, wlc<kqj> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static myx a(wlc<gur> wlc, wlc<gup> wlc2, wlc<Resources> wlc3, wlc<kqj> wlc4) {
        return new myx(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new myw((gur) this.a.get(), (gup) this.b.get(), (Resources) this.c.get(), (kqj) this.d.get());
    }
}

package defpackage;

import android.content.res.Resources;

/* renamed from: naa reason: default package */
public final class naa implements vua<mzz> {
    private final wlc<gur> a;
    private final wlc<gup> b;
    private final wlc<Resources> c;

    private naa(wlc<gur> wlc, wlc<gup> wlc2, wlc<Resources> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static naa a(wlc<gur> wlc, wlc<gup> wlc2, wlc<Resources> wlc3) {
        return new naa(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mzz((gur) this.a.get(), (gup) this.b.get(), (Resources) this.c.get());
    }
}

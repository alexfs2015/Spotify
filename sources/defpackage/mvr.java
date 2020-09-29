package defpackage;

import android.content.res.Resources;

/* renamed from: mvr reason: default package */
public final class mvr implements vua<mvq> {
    private final wlc<gur> a;
    private final wlc<gup> b;
    private final wlc<Resources> c;

    private mvr(wlc<gur> wlc, wlc<gup> wlc2, wlc<Resources> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mvr a(wlc<gur> wlc, wlc<gup> wlc2, wlc<Resources> wlc3) {
        return new mvr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mvq((gur) this.a.get(), (gup) this.b.get(), (Resources) this.c.get());
    }
}

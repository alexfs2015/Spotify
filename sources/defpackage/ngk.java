package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: ngk reason: default package */
public final class ngk implements vua<ngj> {
    private final wlc<gup> a;
    private final wlc<gur> b;
    private final wlc<gum> c;
    private final wlc<ObjectMapper> d;

    private ngk(wlc<gup> wlc, wlc<gur> wlc2, wlc<gum> wlc3, wlc<ObjectMapper> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ngk a(wlc<gup> wlc, wlc<gur> wlc2, wlc<gum> wlc3, wlc<ObjectMapper> wlc4) {
        return new ngk(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        ngj ngj = new ngj((gup) this.a.get(), (gur) this.b.get(), (gum) this.c.get());
        ngj.a = (ObjectMapper) this.d.get();
        return ngj;
    }
}

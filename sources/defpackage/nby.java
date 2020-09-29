package defpackage;

import android.content.Context;

/* renamed from: nby reason: default package */
public final class nby implements vua<gur> {
    private final wlc<sih> a;
    private final wlc<gum> b;
    private final wlc<Context> c;
    private final wlc<nbp> d;

    private nby(wlc<sih> wlc, wlc<gum> wlc2, wlc<Context> wlc3, wlc<nbp> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static nby a(wlc<sih> wlc, wlc<gum> wlc2, wlc<Context> wlc3, wlc<nbp> wlc4) {
        return new nby(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(CC.a((sih) this.a.get(), (gum) this.b.get(), (Context) this.c.get(), (nbp) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import android.content.Context;

/* renamed from: hon reason: default package */
public final class hon implements vua<hom> {
    private final wlc<Context> a;
    private final wlc<ufq> b;
    private final wlc<hou> c;
    private final wlc<ugk> d;

    private hon(wlc<Context> wlc, wlc<ufq> wlc2, wlc<hou> wlc3, wlc<ugk> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hon a(wlc<Context> wlc, wlc<ufq> wlc2, wlc<hou> wlc3, wlc<ugk> wlc4) {
        return new hon(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hom((Context) this.a.get(), (ufq) this.b.get(), (hou) this.c.get(), (ugk) this.d.get());
    }
}

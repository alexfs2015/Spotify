package defpackage;

import android.content.Context;

/* renamed from: jjk reason: default package */
public final class jjk implements vua<jjj> {
    private final wlc<Context> a;
    private final wlc<hfx> b;

    private jjk(wlc<Context> wlc, wlc<hfx> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jjk a(wlc<Context> wlc, wlc<hfx> wlc2) {
        return new jjk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jjj((Context) this.a.get(), (hfx) this.b.get());
    }
}

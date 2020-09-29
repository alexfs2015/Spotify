package defpackage;

import android.content.Context;

/* renamed from: lxk reason: default package */
public final class lxk implements vua<luy> {
    private final wlc<Context> a;
    private final wlc<spe> b;

    private lxk(wlc<Context> wlc, wlc<spe> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lxk a(wlc<Context> wlc, wlc<spe> wlc2) {
        return new lxk(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (luy) vuf.a(new luv((Context) this.a.get(), (spe) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import android.content.Context;

/* renamed from: lke reason: default package */
public final class lke implements vua<gec> {
    private final wlc<Context> a;
    private final wlc<gho> b;
    private final wlc<geo> c;

    private lke(wlc<Context> wlc, wlc<gho> wlc2, wlc<geo> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lke a(wlc<Context> wlc, wlc<gho> wlc2, wlc<geo> wlc3) {
        return new lke(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (gec) vuf.a(new gec((Context) this.a.get(), ((gho) this.b.get()).b, (geo) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

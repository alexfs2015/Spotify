package defpackage;

import android.content.Context;

/* renamed from: lhd reason: default package */
public final class lhd implements vua<rti> {
    private final wlc<Context> a;
    private final wlc<gbd> b;

    private lhd(wlc<Context> wlc, wlc<gbd> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lhd a(wlc<Context> wlc, wlc<gbd> wlc2) {
        return new lhd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (rti) vuf.a(new ruf((Context) this.a.get(), (gbd) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

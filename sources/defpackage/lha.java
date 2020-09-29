package defpackage;

import android.content.Context;

/* renamed from: lha reason: default package */
public final class lha implements vua<rti> {
    private final wlc<Context> a;
    private final wlc<gbd> b;

    private lha(wlc<Context> wlc, wlc<gbd> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lha a(wlc<Context> wlc, wlc<gbd> wlc2) {
        return new lha(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (rti) vuf.a(new loy((Context) this.a.get(), (gbd) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

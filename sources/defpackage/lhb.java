package defpackage;

import android.content.Context;

/* renamed from: lhb reason: default package */
public final class lhb implements vua<rti> {
    private final wlc<Context> a;
    private final wlc<gbd> b;

    private lhb(wlc<Context> wlc, wlc<gbd> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static lhb a(wlc<Context> wlc, wlc<gbd> wlc2) {
        return new lhb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (rti) vuf.a(new lpd((Context) this.a.get(), (gbd) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

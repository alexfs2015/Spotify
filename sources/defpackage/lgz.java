package defpackage;

import android.content.Context;

/* renamed from: lgz reason: default package */
public final class lgz implements vua<rti> {
    private final wlc<Context> a;
    private final wlc<gbd> b;
    private final wlc<lpb> c;

    private lgz(wlc<Context> wlc, wlc<gbd> wlc2, wlc<lpb> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static lgz a(wlc<Context> wlc, wlc<gbd> wlc2, wlc<lpb> wlc3) {
        return new lgz(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (rti) vuf.a(new lou((Context) this.a.get(), (gbd) this.b.get(), (lpb) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

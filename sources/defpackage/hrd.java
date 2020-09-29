package defpackage;

import android.content.Context;

/* renamed from: hrd reason: default package */
public final class hrd implements vua<hrc> {
    private final wlc<Context> a;
    private final wlc<hrp> b;

    private hrd(wlc<Context> wlc, wlc<hrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hrd a(wlc<Context> wlc, wlc<hrp> wlc2) {
        return new hrd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hrc((Context) this.a.get(), (hrp) this.b.get());
    }
}

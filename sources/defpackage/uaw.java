package defpackage;

import android.content.Context;

/* renamed from: uaw reason: default package */
public final class uaw implements vua<uav> {
    private final wlc<Context> a;
    private final wlc<uau> b;
    private final wlc<fpt> c;

    private uaw(wlc<Context> wlc, wlc<uau> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static uaw a(wlc<Context> wlc, wlc<uau> wlc2, wlc<fpt> wlc3) {
        return new uaw(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new uav((Context) this.a.get(), (uau) this.b.get(), (fpt) this.c.get());
    }
}

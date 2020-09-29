package defpackage;

import android.content.Context;

/* renamed from: ilc reason: default package */
public final class ilc implements vua<ilb> {
    private final wlc<Context> a;
    private final wlc<ikt> b;

    private ilc(wlc<Context> wlc, wlc<ikt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ilc a(wlc<Context> wlc, wlc<ikt> wlc2) {
        return new ilc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ilb((Context) this.a.get(), (ikt) this.b.get());
    }
}

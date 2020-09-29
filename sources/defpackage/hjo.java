package defpackage;

import android.content.Context;

/* renamed from: hjo reason: default package */
public final class hjo implements vua<hjn> {
    private final wlc<Context> a;
    private final wlc<vhw> b;

    private hjo(wlc<Context> wlc, wlc<vhw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hjo a(wlc<Context> wlc, wlc<vhw> wlc2) {
        return new hjo(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hjn((Context) this.a.get(), (vhw) this.b.get());
    }
}

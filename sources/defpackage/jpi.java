package defpackage;

import android.content.Context;

/* renamed from: jpi reason: default package */
public final class jpi implements vua<jph> {
    private final wlc<Context> a;
    private final wlc<jvy> b;

    private jpi(wlc<Context> wlc, wlc<jvy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jpi a(wlc<Context> wlc, wlc<jvy> wlc2) {
        return new jpi(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jph((Context) this.a.get(), (jvy) this.b.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: jme reason: default package */
public final class jme implements vua<jmd> {
    private final wlc<Context> a;
    private final wlc<sih> b;

    private jme(wlc<Context> wlc, wlc<sih> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static jme a(wlc<Context> wlc, wlc<sih> wlc2) {
        return new jme(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new jmd((Context) this.a.get(), (sih) this.b.get());
    }
}

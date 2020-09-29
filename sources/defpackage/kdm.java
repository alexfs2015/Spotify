package defpackage;

import android.content.Context;

/* renamed from: kdm reason: default package */
public final class kdm implements vua<kdl> {
    private final wlc<Context> a;
    private final wlc<jvy> b;

    private kdm(wlc<Context> wlc, wlc<jvy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kdm a(wlc<Context> wlc, wlc<jvy> wlc2) {
        return new kdm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kdl((Context) this.a.get(), (jvy) this.b.get());
    }
}

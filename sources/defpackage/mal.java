package defpackage;

import android.content.Context;

/* renamed from: mal reason: default package */
public final class mal implements vua<mak> {
    private final wlc<Context> a;
    private final wlc<mag> b;

    private mal(wlc<Context> wlc, wlc<mag> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mal a(wlc<Context> wlc, wlc<mag> wlc2) {
        return new mal(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mak((Context) this.a.get(), (mag) this.b.get());
    }
}

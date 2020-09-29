package defpackage;

import android.content.Context;

/* renamed from: qtn reason: default package */
public final class qtn implements vua<qtm> {
    private final wlc<qzq> a;
    private final wlc<Context> b;

    private qtn(wlc<qzq> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qtn a(wlc<qzq> wlc, wlc<Context> wlc2) {
        return new qtn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qtm((qzq) this.a.get(), (Context) this.b.get());
    }
}

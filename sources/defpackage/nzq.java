package defpackage;

import android.content.Context;

/* renamed from: nzq reason: default package */
public final class nzq implements vua<nzp> {
    private final wlc<Context> a;

    private nzq(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nzq a(wlc<Context> wlc) {
        return new nzq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nzp((Context) this.a.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: nfr reason: default package */
public final class nfr implements vua<Boolean> {
    private final wlc<Context> a;

    private nfr(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nfr a(wlc<Context> wlc) {
        return new nfr(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jtc.c((Context) this.a.get()));
    }
}

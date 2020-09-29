package defpackage;

import android.content.Context;

/* renamed from: mxb reason: default package */
public final class mxb implements vua<Boolean> {
    private final wlc<Context> a;

    private mxb(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mxb a(wlc<Context> wlc) {
        return new mxb(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jtc.c((Context) this.a.get()));
    }
}

package defpackage;

import android.content.Context;

/* renamed from: iab reason: default package */
public final class iab implements vua<Boolean> {
    private final wlc<Context> a;

    private iab(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static iab a(wlc<Context> wlc) {
        return new iab(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jtc.c((Context) this.a.get()));
    }
}

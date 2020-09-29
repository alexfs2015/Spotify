package defpackage;

import android.content.Context;

/* renamed from: mth reason: default package */
public final class mth implements vua<Boolean> {
    private final wlc<Context> a;

    private mth(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mth a(wlc<Context> wlc) {
        return new mth(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(!jtc.c((Context) this.a.get()));
    }
}

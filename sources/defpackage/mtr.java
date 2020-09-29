package defpackage;

import android.content.Context;

/* renamed from: mtr reason: default package */
public final class mtr implements vua<Boolean> {
    private final wlc<Context> a;

    private mtr(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mtr a(wlc<Context> wlc) {
        return new mtr(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jtc.c((Context) this.a.get()));
    }
}

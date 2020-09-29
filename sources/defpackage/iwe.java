package defpackage;

import android.content.Context;

/* renamed from: iwe reason: default package */
public final class iwe implements vua<Boolean> {
    private final wlc<Context> a;

    private iwe(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static iwe a(wlc<Context> wlc) {
        return new iwe(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jtc.c((Context) this.a.get()));
    }
}

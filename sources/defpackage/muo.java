package defpackage;

import android.content.Context;

/* renamed from: muo reason: default package */
public final class muo implements vua<mun> {
    private final wlc<Context> a;

    private muo(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static muo a(wlc<Context> wlc) {
        return new muo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mun((Context) this.a.get());
    }
}

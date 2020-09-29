package defpackage;

import android.content.Context;

/* renamed from: mib reason: default package */
public final class mib implements vua<mia> {
    private final wlc<Context> a;

    private mib(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static mib a(wlc<Context> wlc) {
        return new mib(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mia((Context) this.a.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: spf reason: default package */
public final class spf implements vua<spe> {
    private final wlc<Context> a;

    private spf(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static spf a(wlc<Context> wlc) {
        return new spf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new spe((Context) this.a.get());
    }
}

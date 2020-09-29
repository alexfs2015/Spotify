package defpackage;

import android.content.Context;

/* renamed from: kdb reason: default package */
public final class kdb implements vua<kda> {
    private final wlc<Context> a;
    private final wlc<vjo> b;

    private kdb(wlc<Context> wlc, wlc<vjo> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kdb a(wlc<Context> wlc, wlc<vjo> wlc2) {
        return new kdb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kda((Context) this.a.get(), (vjo) this.b.get());
    }
}

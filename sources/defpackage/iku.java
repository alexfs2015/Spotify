package defpackage;

import android.content.Context;

/* renamed from: iku reason: default package */
public final class iku implements vua<ikt> {
    private final wlc<Context> a;
    private final wlc<vjo> b;
    private final wlc<ikv> c;

    private iku(wlc<Context> wlc, wlc<vjo> wlc2, wlc<ikv> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static iku a(wlc<Context> wlc, wlc<vjo> wlc2, wlc<ikv> wlc3) {
        return new iku(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ikt((Context) this.a.get(), (vjo) this.b.get(), (ikv) this.c.get());
    }
}

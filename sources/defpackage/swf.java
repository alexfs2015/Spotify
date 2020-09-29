package defpackage;

import android.content.Context;

/* renamed from: swf reason: default package */
public final class swf implements vua<swe> {
    private final wlc<Context> a;
    private final wlc<hfx> b;

    private swf(wlc<Context> wlc, wlc<hfx> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static swf a(wlc<Context> wlc, wlc<hfx> wlc2) {
        return new swf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new swe((Context) this.a.get(), (hfx) this.b.get());
    }
}

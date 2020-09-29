package defpackage;

import android.content.Context;

/* renamed from: ljn reason: default package */
public final class ljn implements vua<gay> {
    private final wlc<Context> a;
    private final wlc<hfx> b;

    private ljn(wlc<Context> wlc, wlc<hfx> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ljn a(wlc<Context> wlc, wlc<hfx> wlc2) {
        return new ljn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (gay) vuf.a(CC.a((Context) this.a.get(), (hfx) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

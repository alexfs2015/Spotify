package defpackage;

import android.content.Context;

/* renamed from: liq reason: default package */
public final class liq implements vua<uvn> {
    private final wlc<Context> a;

    private liq(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static liq a(wlc<Context> wlc) {
        return new liq(wlc);
    }

    public final /* synthetic */ Object get() {
        return (uvn) vuf.a(new uvn((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

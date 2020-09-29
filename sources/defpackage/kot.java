package defpackage;

import android.content.Context;

/* renamed from: kot reason: default package */
public final class kot implements vua<kos> {
    private final wlc<Context> a;
    private final wlc<spi> b;

    private kot(wlc<Context> wlc, wlc<spi> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kot a(wlc<Context> wlc, wlc<spi> wlc2) {
        return new kot(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kos((Context) this.a.get(), (spi) this.b.get());
    }
}

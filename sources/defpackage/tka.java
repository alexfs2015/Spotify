package defpackage;

import android.content.Context;

/* renamed from: tka reason: default package */
public final class tka<T> implements vua<tjz<T>> {
    private final wlc<Context> a;
    private final wlc<sih> b;

    private tka(wlc<Context> wlc, wlc<sih> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static <T> tka<T> a(wlc<Context> wlc, wlc<sih> wlc2) {
        return new tka<>(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tjz((Context) this.a.get(), (sih) this.b.get());
    }
}

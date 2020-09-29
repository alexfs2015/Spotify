package defpackage;

import android.content.Context;

/* renamed from: ttn reason: default package */
public final class ttn implements vua<ttm> {
    private final wlc<Context> a;

    private ttn(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ttn a(wlc<Context> wlc) {
        return new ttn(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ttm((Context) this.a.get());
    }
}

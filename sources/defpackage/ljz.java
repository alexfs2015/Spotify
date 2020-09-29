package defpackage;

import android.content.Context;

/* renamed from: ljz reason: default package */
public final class ljz implements vua<ljy> {
    private final wlc<Context> a;

    private ljz(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ljz a(wlc<Context> wlc) {
        return new ljz(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ljy((Context) this.a.get());
    }
}

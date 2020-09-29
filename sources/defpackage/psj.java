package defpackage;

import android.content.Context;

/* renamed from: psj reason: default package */
public final class psj implements vua<psi> {
    private final wlc<Context> a;

    private psj(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static psj a(wlc<Context> wlc) {
        return new psj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new psi((Context) this.a.get());
    }
}

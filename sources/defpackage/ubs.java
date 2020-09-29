package defpackage;

import android.content.Context;

/* renamed from: ubs reason: default package */
public final class ubs implements vua<ubr> {
    private final wlc<Context> a;

    private ubs(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ubs a(wlc<Context> wlc) {
        return new ubs(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ubr((Context) this.a.get());
    }
}

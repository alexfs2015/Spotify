package defpackage;

import android.content.Context;

/* renamed from: fst reason: default package */
public final class fst implements vua<fss> {
    private final wlc<Context> a;

    private fst(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static fst a(wlc<Context> wlc) {
        return new fst(wlc);
    }

    public final /* synthetic */ Object get() {
        return new fss((Context) this.a.get());
    }
}

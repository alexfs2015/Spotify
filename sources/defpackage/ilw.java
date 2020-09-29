package defpackage;

import android.content.Context;

/* renamed from: ilw reason: default package */
public final class ilw implements vua<ilv> {
    private final wlc<Context> a;

    private ilw(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ilw a(wlc<Context> wlc) {
        return new ilw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ilv((Context) this.a.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: tzq reason: default package */
public final class tzq implements vua<tzp> {
    private final wlc<Context> a;

    private tzq(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tzq a(wlc<Context> wlc) {
        return new tzq(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tzp((Context) this.a.get());
    }
}

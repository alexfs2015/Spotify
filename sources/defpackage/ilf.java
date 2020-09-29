package defpackage;

import android.content.Context;

/* renamed from: ilf reason: default package */
public final class ilf implements vua<ile> {
    private final wlc<Context> a;

    private ilf(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static ilf a(wlc<Context> wlc) {
        return new ilf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ile((Context) this.a.get());
    }
}

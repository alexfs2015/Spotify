package defpackage;

import android.content.Context;

/* renamed from: qzr reason: default package */
public final class qzr implements vua<qzq> {
    private final wlc<Context> a;

    private qzr(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qzr a(wlc<Context> wlc) {
        return new qzr(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qzq((Context) this.a.get());
    }
}

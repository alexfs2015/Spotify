package defpackage;

import android.content.Context;

/* renamed from: qye reason: default package */
public final class qye implements vua<qyd> {
    private final wlc<Context> a;
    private final wlc<qwr> b;

    private qye(wlc<Context> wlc, wlc<qwr> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qye a(wlc<Context> wlc, wlc<qwr> wlc2) {
        return new qye(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qyd((Context) this.a.get(), (qwr) this.b.get());
    }
}

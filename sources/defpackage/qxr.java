package defpackage;

import android.content.Context;

/* renamed from: qxr reason: default package */
public final class qxr implements vua<qxq> {
    private final wlc<Context> a;
    private final wlc<qsr> b;
    private final wlc<String> c;

    private qxr(wlc<Context> wlc, wlc<qsr> wlc2, wlc<String> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qxr a(wlc<Context> wlc, wlc<qsr> wlc2, wlc<String> wlc3) {
        return new qxr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qxq((Context) this.a.get(), (qsr) this.b.get(), (String) this.c.get());
    }
}

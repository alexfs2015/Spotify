package defpackage;

import android.content.Context;

/* renamed from: qbf reason: default package */
public final class qbf implements vua<qbe> {
    private final wlc<Context> a;
    private final wlc<jmq> b;
    private final wlc<a> c;
    private final wlc<gxz> d;

    private qbf(wlc<Context> wlc, wlc<jmq> wlc2, wlc<a> wlc3, wlc<gxz> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qbf a(wlc<Context> wlc, wlc<jmq> wlc2, wlc<a> wlc3, wlc<gxz> wlc4) {
        return new qbf(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qbe((Context) this.a.get(), (jmq) this.b.get(), (a) this.c.get(), (gxz) this.d.get());
    }
}

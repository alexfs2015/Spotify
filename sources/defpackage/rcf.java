package defpackage;

import android.content.Context;

/* renamed from: rcf reason: default package */
public final class rcf implements vua<rce> {
    private final wlc<Context> a;
    private final wlc<kf> b;
    private final wlc<rcj> c;

    private rcf(wlc<Context> wlc, wlc<kf> wlc2, wlc<rcj> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rcf a(wlc<Context> wlc, wlc<kf> wlc2, wlc<rcj> wlc3) {
        return new rcf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rce((Context) this.a.get(), (kf) this.b.get(), (rcj) this.c.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: qfd reason: default package */
public final class qfd implements vua<qfc> {
    private final wlc<Context> a;
    private final wlc<jvy> b;
    private final wlc<rnf> c;

    private qfd(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qfd a(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        return new qfd(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qfc((Context) this.a.get(), (jvy) this.b.get(), (rnf) this.c.get());
    }
}

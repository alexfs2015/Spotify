package defpackage;

import android.content.Context;

/* renamed from: qzf reason: default package */
public final class qzf implements vua<qze> {
    private final wlc<Context> a;
    private final wlc<jvy> b;

    private qzf(wlc<Context> wlc, wlc<jvy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qzf a(wlc<Context> wlc, wlc<jvy> wlc2) {
        return new qzf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qze((Context) this.a.get(), (jvy) this.b.get());
    }
}

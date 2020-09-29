package defpackage;

import android.content.Context;

/* renamed from: qzp reason: default package */
public final class qzp implements vua<qzo> {
    private final wlc<Context> a;

    private qzp(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qzp a(wlc<Context> wlc) {
        return new qzp(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qzo((Context) this.a.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: qfh reason: default package */
public final class qfh implements vua<qfg> {
    private final wlc<sih> a;
    private final wlc<Context> b;

    private qfh(wlc<sih> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static qfh a(wlc<sih> wlc, wlc<Context> wlc2) {
        return new qfh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new qfg((sih) this.a.get(), (Context) this.b.get());
    }
}

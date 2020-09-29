package defpackage;

import android.content.Context;

/* renamed from: qga reason: default package */
public final class qga implements vua<qfz> {
    private final wlc<fss> a;
    private final wlc<Context> b;
    private final wlc<ujc> c;

    private qga(wlc<fss> wlc, wlc<Context> wlc2, wlc<ujc> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static qga a(wlc<fss> wlc, wlc<Context> wlc2, wlc<ujc> wlc3) {
        return new qga(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new qfz((fss) this.a.get(), (Context) this.b.get(), (ujc) this.c.get());
    }
}

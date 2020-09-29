package defpackage;

import android.content.Context;

/* renamed from: qcb reason: default package */
public final class qcb implements vua<qca> {
    private final wlc<Context> a;

    private qcb(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qcb a(wlc<Context> wlc) {
        return new qcb(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qca((Context) this.a.get());
    }
}

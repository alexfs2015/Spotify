package defpackage;

import android.content.Context;

/* renamed from: qsg reason: default package */
public final class qsg implements vua<qsf> {
    private final wlc<Context> a;

    private qsg(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qsg a(wlc<Context> wlc) {
        return new qsg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qsf((Context) this.a.get());
    }
}

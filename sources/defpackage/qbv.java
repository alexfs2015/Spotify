package defpackage;

import android.content.Context;

/* renamed from: qbv reason: default package */
public final class qbv implements vua<qbu> {
    private final wlc<Context> a;

    private qbv(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qbv a(wlc<Context> wlc) {
        return new qbv(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qbu((Context) this.a.get());
    }
}

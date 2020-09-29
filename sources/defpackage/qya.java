package defpackage;

import android.content.Context;

/* renamed from: qya reason: default package */
public final class qya implements vua<qxz> {
    private final wlc<Context> a;

    private qya(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qya a(wlc<Context> wlc) {
        return new qya(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qxz((Context) this.a.get());
    }
}

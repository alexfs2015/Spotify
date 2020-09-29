package defpackage;

import android.content.Context;

/* renamed from: qxa reason: default package */
public final class qxa implements vua<qwz> {
    private final wlc<Context> a;

    private qxa(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qxa a(wlc<Context> wlc) {
        return new qxa(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qwz((Context) this.a.get());
    }
}

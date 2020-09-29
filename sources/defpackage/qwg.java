package defpackage;

import android.content.Context;

/* renamed from: qwg reason: default package */
public final class qwg implements vua<qwf> {
    private final wlc<Context> a;

    private qwg(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qwg a(wlc<Context> wlc) {
        return new qwg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qwf((Context) this.a.get());
    }
}

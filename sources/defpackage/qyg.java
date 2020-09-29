package defpackage;

import android.content.Context;

/* renamed from: qyg reason: default package */
public final class qyg implements vua<qyf> {
    private final wlc<Context> a;

    private qyg(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qyg a(wlc<Context> wlc) {
        return new qyg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qyf((Context) this.a.get());
    }
}

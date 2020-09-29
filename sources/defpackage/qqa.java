package defpackage;

import android.content.Context;

/* renamed from: qqa reason: default package */
public final class qqa implements vua<Boolean> {
    private final wlc<Context> a;

    private qqa(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qqa a(wlc<Context> wlc) {
        return new qqa(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jtc.c((Context) this.a.get()));
    }
}

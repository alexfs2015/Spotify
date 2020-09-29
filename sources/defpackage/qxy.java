package defpackage;

import android.content.Context;

/* renamed from: qxy reason: default package */
public final class qxy implements vua<qxx> {
    private final wlc<Context> a;

    private qxy(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static qxy a(wlc<Context> wlc) {
        return new qxy(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qxx((Context) this.a.get());
    }
}

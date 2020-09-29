package defpackage;

import android.content.Context;

/* renamed from: nuw reason: default package */
public final class nuw implements vua<nuv> {
    private final wlc<Context> a;

    private nuw(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static nuw a(wlc<Context> wlc) {
        return new nuw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nuv((Context) this.a.get());
    }
}

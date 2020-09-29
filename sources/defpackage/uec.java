package defpackage;

import android.content.Context;

/* renamed from: uec reason: default package */
public final class uec implements vua<ueb> {
    private final wlc<Context> a;

    private uec(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static uec a(wlc<Context> wlc) {
        return new uec(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ueb((Context) this.a.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: hzv reason: default package */
public final class hzv implements vua<hzt> {
    private final wlc<Context> a;
    private final wlc<hhc> b;

    private hzv(wlc<Context> wlc, wlc<hhc> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hzv a(wlc<Context> wlc, wlc<hhc> wlc2) {
        return new hzv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hzt((Context) this.a.get(), (hhc) this.b.get());
    }
}

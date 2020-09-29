package defpackage;

import android.content.Context;

/* renamed from: rad reason: default package */
public final class rad implements vua<rac> {
    private final wlc<Context> a;

    private rad(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static rad a(wlc<Context> wlc) {
        return new rad(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rac((Context) this.a.get());
    }
}

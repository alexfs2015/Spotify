package defpackage;

import android.content.Context;

/* renamed from: hgj reason: default package */
public final class hgj implements vua<hgi> {
    private final wlc<Context> a;

    private hgj(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static hgj a(wlc<Context> wlc) {
        return new hgj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hgi((Context) this.a.get());
    }
}

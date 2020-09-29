package defpackage;

import android.content.Context;

/* renamed from: hdg reason: default package */
public final class hdg implements vua<hdf> {
    private final wlc<Context> a;

    private hdg(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static hdg a(wlc<Context> wlc) {
        return new hdg(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hdf((Context) this.a.get());
    }
}

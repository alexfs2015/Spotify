package defpackage;

import android.content.Context;

/* renamed from: mhx reason: default package */
public final class mhx implements vua<mht> {
    private final wlc<Context> a;
    private final wlc<mhu> b;

    private mhx(wlc<Context> wlc, wlc<mhu> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mhx a(wlc<Context> wlc, wlc<mhu> wlc2) {
        return new mhx(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mht((Context) this.a.get(), (mhu) this.b.get());
    }
}

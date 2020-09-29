package defpackage;

import android.content.Context;

/* renamed from: tlu reason: default package */
public final class tlu implements vua<tlt> {
    private final wlc<Context> a;

    private tlu(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tlu a(wlc<Context> wlc) {
        return new tlu(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tlt((Context) this.a.get());
    }
}

package defpackage;

import android.content.Context;

/* renamed from: kdh reason: default package */
public final class kdh implements vua<kdg> {
    private final wlc<Context> a;
    private final wlc<kde> b;

    private kdh(wlc<Context> wlc, wlc<kde> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kdh a(wlc<Context> wlc, wlc<kde> wlc2) {
        return new kdh(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kdg((Context) this.a.get(), (kde) this.b.get());
    }
}

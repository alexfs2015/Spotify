package defpackage;

import android.content.Context;

/* renamed from: hhd reason: default package */
public final class hhd implements vua<hhc> {
    private final wlc<Context> a;
    private final wlc<Boolean> b;

    private hhd(wlc<Context> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hhd a(wlc<Context> wlc, wlc<Boolean> wlc2) {
        return new hhd(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hhc((Context) this.a.get(), ((Boolean) this.b.get()).booleanValue());
    }
}

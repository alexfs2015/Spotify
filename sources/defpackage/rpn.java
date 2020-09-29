package defpackage;

import android.content.Context;

/* renamed from: rpn reason: default package */
public final class rpn implements vua<rpm> {
    private final wlc<Context> a;
    private final wlc<rpk> b;

    private rpn(wlc<Context> wlc, wlc<rpk> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rpn a(wlc<Context> wlc, wlc<rpk> wlc2) {
        return new rpn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rpm((Context) this.a.get(), (rpk) this.b.get());
    }
}

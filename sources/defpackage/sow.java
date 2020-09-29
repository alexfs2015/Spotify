package defpackage;

import android.content.Context;

/* renamed from: sow reason: default package */
public final class sow implements vua<sov> {
    private final wlc<Context> a;

    private sow(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static sow a(wlc<Context> wlc) {
        return new sow(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sov((Context) this.a.get());
    }
}

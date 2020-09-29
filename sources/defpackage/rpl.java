package defpackage;

import android.content.Context;

/* renamed from: rpl reason: default package */
public final class rpl implements vua<rpk> {
    private final wlc<Context> a;
    private final wlc<a> b;

    private rpl(wlc<Context> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rpl a(wlc<Context> wlc, wlc<a> wlc2) {
        return new rpl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rpk(this.a, this.b);
    }
}

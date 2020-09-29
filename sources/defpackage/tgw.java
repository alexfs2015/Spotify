package defpackage;

import android.content.Context;

/* renamed from: tgw reason: default package */
public final class tgw implements vua<tgv> {
    private final wlc<Context> a;

    private tgw(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static tgw a(wlc<Context> wlc) {
        return new tgw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new tgv((Context) this.a.get());
    }
}

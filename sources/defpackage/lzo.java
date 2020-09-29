package defpackage;

import android.content.Context;

/* renamed from: lzo reason: default package */
public final class lzo implements vua<lzm> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<Boolean> c;
    private final wlc<Boolean> d;

    private lzo(wlc<Context> wlc, wlc<a> wlc2, wlc<Boolean> wlc3, wlc<Boolean> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lzo a(wlc<Context> wlc, wlc<a> wlc2, wlc<Boolean> wlc3, wlc<Boolean> wlc4) {
        return new lzo(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new lzm((Context) this.a.get(), (a) this.b.get(), ((Boolean) this.c.get()).booleanValue(), ((Boolean) this.d.get()).booleanValue());
    }
}

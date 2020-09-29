package defpackage;

import android.content.Context;

/* renamed from: ikr reason: default package */
public final class ikr implements vua<ikq> {
    private final wlc<Context> a;
    private final wlc<ilb> b;
    private final wlc<ikv> c;

    private ikr(wlc<Context> wlc, wlc<ilb> wlc2, wlc<ikv> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ikr a(wlc<Context> wlc, wlc<ilb> wlc2, wlc<ikv> wlc3) {
        return new ikr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ikq((Context) this.a.get(), (ilb) this.b.get(), (ikv) this.c.get());
    }
}

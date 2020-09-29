package defpackage;

import android.content.Context;

/* renamed from: tst reason: default package */
public final class tst implements vua<tss> {
    private final wlc<iww> a;
    private final wlc<Context> b;
    private final wlc<tvw> c;

    private tst(wlc<iww> wlc, wlc<Context> wlc2, wlc<tvw> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tst a(wlc<iww> wlc, wlc<Context> wlc2, wlc<tvw> wlc3) {
        return new tst(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tss((iww) this.a.get(), (Context) this.b.get(), (tvw) this.c.get());
    }
}

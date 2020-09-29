package defpackage;

import android.content.Context;

/* renamed from: hrb reason: default package */
public final class hrb implements vua<hra> {
    private final wlc<Context> a;
    private final wlc<jro> b;
    private final wlc<jrf> c;
    private final wlc<hpg> d;
    private final wlc<hde> e;

    private hrb(wlc<Context> wlc, wlc<jro> wlc2, wlc<jrf> wlc3, wlc<hpg> wlc4, wlc<hde> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hrb a(wlc<Context> wlc, wlc<jro> wlc2, wlc<jrf> wlc3, wlc<hpg> wlc4, wlc<hde> wlc5) {
        hrb hrb = new hrb(wlc, wlc2, wlc3, wlc4, wlc5);
        return hrb;
    }

    public final /* synthetic */ Object get() {
        hra hra = new hra((Context) this.a.get(), (jro) this.b.get(), (jrf) this.c.get(), (hpg) this.d.get(), (hde) this.e.get());
        return hra;
    }
}

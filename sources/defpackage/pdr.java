package defpackage;

import android.content.Context;

/* renamed from: pdr reason: default package */
public final class pdr implements vua<pdq> {
    private final wlc<gut> a;
    private final wlc<gum> b;
    private final wlc<iqs> c;
    private final wlc<Context> d;

    private pdr(wlc<gut> wlc, wlc<gum> wlc2, wlc<iqs> wlc3, wlc<Context> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pdr a(wlc<gut> wlc, wlc<gum> wlc2, wlc<iqs> wlc3, wlc<Context> wlc4) {
        return new pdr(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pdq((gut) this.a.get(), (gum) this.b.get(), (iqs) this.c.get(), (Context) this.d.get());
    }
}

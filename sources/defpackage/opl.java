package defpackage;

import android.content.Context;

/* renamed from: opl reason: default package */
public final class opl implements vua<opk> {
    private final wlc<Context> a;
    private final wlc<oph> b;
    private final wlc<fpt> c;
    private final wlc<rgz> d;
    private final wlc<rfd> e;
    private final wlc<jro> f;

    private opl(wlc<Context> wlc, wlc<oph> wlc2, wlc<fpt> wlc3, wlc<rgz> wlc4, wlc<rfd> wlc5, wlc<jro> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static opl a(wlc<Context> wlc, wlc<oph> wlc2, wlc<fpt> wlc3, wlc<rgz> wlc4, wlc<rfd> wlc5, wlc<jro> wlc6) {
        opl opl = new opl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return opl;
    }

    public final /* synthetic */ Object get() {
        opk opk = new opk((Context) this.a.get(), (oph) this.b.get(), (fpt) this.c.get(), (rgz) this.d.get(), (rfd) this.e.get(), (jro) this.f.get());
        return opk;
    }
}

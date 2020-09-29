package defpackage;

import android.content.Context;

/* renamed from: nsr reason: default package */
public final class nsr implements vua<nsq> {
    private final wlc<nsp> a;
    private final wlc<jrp> b;
    private final wlc<jro> c;
    private final wlc<String> d;
    private final wlc<Context> e;

    private nsr(wlc<nsp> wlc, wlc<jrp> wlc2, wlc<jro> wlc3, wlc<String> wlc4, wlc<Context> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static nsr a(wlc<nsp> wlc, wlc<jrp> wlc2, wlc<jro> wlc3, wlc<String> wlc4, wlc<Context> wlc5) {
        nsr nsr = new nsr(wlc, wlc2, wlc3, wlc4, wlc5);
        return nsr;
    }

    public final /* synthetic */ Object get() {
        nsq nsq = new nsq((nsp) this.a.get(), (jrp) this.b.get(), (jro) this.c.get(), (String) this.d.get(), (Context) this.e.get());
        return nsq;
    }
}

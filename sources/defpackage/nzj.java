package defpackage;

/* renamed from: nzj reason: default package */
public final class nzj implements vua<nzi> {
    private final wlc<jjf> a;
    private final wlc<jsi> b;
    private final wlc<jrp> c;

    private nzj(wlc<jjf> wlc, wlc<jsi> wlc2, wlc<jrp> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nzj a(wlc<jjf> wlc, wlc<jsi> wlc2, wlc<jrp> wlc3) {
        return new nzj(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nzi((jjf) this.a.get(), (jsi) this.b.get(), (jrp) this.c.get());
    }
}

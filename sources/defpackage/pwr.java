package defpackage;

/* renamed from: pwr reason: default package */
public final class pwr implements vua<Boolean> {
    private final wlc<fpt> a;
    private final wlc<sgr> b;
    private final wlc<Boolean> c;

    private pwr(wlc<fpt> wlc, wlc<sgr> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pwr a(wlc<fpt> wlc, wlc<sgr> wlc2, wlc<Boolean> wlc3) {
        return new pwr(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        sgr sgr = (sgr) this.b.get();
        return Boolean.valueOf(!((Boolean) this.c.get()).booleanValue() && ((fpt) fay.a((fpt) this.a.get())).b(ses.a));
    }
}

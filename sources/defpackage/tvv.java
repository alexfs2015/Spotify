package defpackage;

/* renamed from: tvv reason: default package */
public final class tvv implements vua<tvu> {
    private final wlc<jrp> a;
    private final wlc<jjf> b;
    private final wlc<gjf> c;
    private final wlc<sih> d;

    private tvv(wlc<jrp> wlc, wlc<jjf> wlc2, wlc<gjf> wlc3, wlc<sih> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static tvv a(wlc<jrp> wlc, wlc<jjf> wlc2, wlc<gjf> wlc3, wlc<sih> wlc4) {
        return new tvv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new tvu((jrp) this.a.get(), (jjf) this.b.get(), (gjf) this.c.get(), (sih) this.d.get());
    }
}

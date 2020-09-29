package defpackage;

/* renamed from: ujl reason: default package */
public final class ujl implements vua<ujk> {
    private final wlc<ujq> a;
    private final wlc<ujm> b;
    private final wlc<ujf> c;
    private final wlc<ujn> d;
    private final wlc<jrs> e;
    private final wlc<jjf> f;

    private ujl(wlc<ujq> wlc, wlc<ujm> wlc2, wlc<ujf> wlc3, wlc<ujn> wlc4, wlc<jrs> wlc5, wlc<jjf> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ujl a(wlc<ujq> wlc, wlc<ujm> wlc2, wlc<ujf> wlc3, wlc<ujn> wlc4, wlc<jrs> wlc5, wlc<jjf> wlc6) {
        ujl ujl = new ujl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ujl;
    }

    public final /* synthetic */ Object get() {
        ujk ujk = new ujk((ujq) this.a.get(), (ujm) this.b.get(), (ujf) this.c.get(), (ujn) this.d.get(), (jrs) this.e.get(), (jjf) this.f.get());
        return ujk;
    }
}

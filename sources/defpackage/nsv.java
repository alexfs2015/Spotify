package defpackage;

/* renamed from: nsv reason: default package */
public final class nsv implements vua<nsu> {
    private final wlc<nsq> a;
    private final wlc<nsx> b;
    private final wlc<hez<gzz>> c;

    private nsv(wlc<nsq> wlc, wlc<nsx> wlc2, wlc<hez<gzz>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nsv a(wlc<nsq> wlc, wlc<nsx> wlc2, wlc<hez<gzz>> wlc3) {
        return new nsv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nsu((nsq) this.a.get(), (nsx) this.b.get(), (hez) this.c.get());
    }
}

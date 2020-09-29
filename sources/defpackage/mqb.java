package defpackage;

/* renamed from: mqb reason: default package */
public final class mqb implements vua<mqa> {
    private final wlc<mqs> a;
    private final wlc<mqq> b;
    private final wlc<mqo> c;

    private mqb(wlc<mqs> wlc, wlc<mqq> wlc2, wlc<mqo> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mqb a(wlc<mqs> wlc, wlc<mqq> wlc2, wlc<mqo> wlc3) {
        return new mqb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mqa((mqs) this.a.get(), (mqq) this.b.get(), (mqo) this.c.get());
    }
}

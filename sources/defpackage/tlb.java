package defpackage;

/* renamed from: tlb reason: default package */
public final class tlb implements vua<tla> {
    private final wlc<tkt> a;
    private final wlc<tkp> b;
    private final wlc<tks> c;

    private tlb(wlc<tkt> wlc, wlc<tkp> wlc2, wlc<tks> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tlb a(wlc<tkt> wlc, wlc<tkp> wlc2, wlc<tks> wlc3) {
        return new tlb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tla((tkt) this.a.get(), (tkp) this.b.get(), (tks) this.c.get());
    }
}

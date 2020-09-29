package defpackage;

/* renamed from: kor reason: default package */
public final class kor implements vua<koq> {
    private final wlc<jjf> a;
    private final wlc<jrp> b;

    private kor(wlc<jjf> wlc, wlc<jrp> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kor a(wlc<jjf> wlc, wlc<jrp> wlc2) {
        return new kor(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new koq((jjf) this.a.get(), (jrp) this.b.get());
    }
}

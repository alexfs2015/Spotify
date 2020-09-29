package defpackage;

/* renamed from: ifg reason: default package */
public final class ifg implements vua<iff> {
    private final wlc<hvv> a;
    private final wlc<jjf> b;
    private final wlc<hvw> c;
    private final wlc<ife> d;

    private ifg(wlc<hvv> wlc, wlc<jjf> wlc2, wlc<hvw> wlc3, wlc<ife> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ifg a(wlc<hvv> wlc, wlc<jjf> wlc2, wlc<hvw> wlc3, wlc<ife> wlc4) {
        return new ifg(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new iff((hvv) this.a.get(), (jjf) this.b.get(), (hvw) this.c.get(), (ife) this.d.get());
    }
}

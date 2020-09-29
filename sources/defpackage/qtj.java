package defpackage;

/* renamed from: qtj reason: default package */
public final class qtj implements vua<qti> {
    private final wlc<qto> a;
    private final wlc<qtm> b;
    private final wlc<qtq> c;
    private final wlc<qts> d;

    private qtj(wlc<qto> wlc, wlc<qtm> wlc2, wlc<qtq> wlc3, wlc<qts> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qtj a(wlc<qto> wlc, wlc<qtm> wlc2, wlc<qtq> wlc3, wlc<qts> wlc4) {
        return new qtj(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qti((qto) this.a.get(), (qtm) this.b.get(), (qtq) this.c.get(), (qts) this.d.get());
    }
}

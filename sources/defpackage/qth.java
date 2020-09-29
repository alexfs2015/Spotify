package defpackage;

/* renamed from: qth reason: default package */
public final class qth implements vua<qtg> {
    private final wlc<qto> a;
    private final wlc<qtm> b;
    private final wlc<qtq> c;
    private final wlc<qts> d;

    private qth(wlc<qto> wlc, wlc<qtm> wlc2, wlc<qtq> wlc3, wlc<qts> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qth a(wlc<qto> wlc, wlc<qtm> wlc2, wlc<qtq> wlc3, wlc<qts> wlc4) {
        return new qth(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qtg((qto) this.a.get(), (qtm) this.b.get(), (qtq) this.c.get(), (qts) this.d.get());
    }
}

package defpackage;

/* renamed from: qsj reason: default package */
public final class qsj implements vua<qsi> {
    private final wlc<kf> a;
    private final wlc<jpb> b;
    private final wlc<qrq> c;
    private final wlc<a> d;
    private final wlc<urb> e;
    private final wlc<qsf> f;

    private qsj(wlc<kf> wlc, wlc<jpb> wlc2, wlc<qrq> wlc3, wlc<a> wlc4, wlc<urb> wlc5, wlc<qsf> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static qsj a(wlc<kf> wlc, wlc<jpb> wlc2, wlc<qrq> wlc3, wlc<a> wlc4, wlc<urb> wlc5, wlc<qsf> wlc6) {
        qsj qsj = new qsj(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return qsj;
    }

    public final /* synthetic */ Object get() {
        qsi qsi = new qsi((kf) this.a.get(), (jpb) this.b.get(), (qrq) this.c.get(), (a) this.d.get(), (urb) this.e.get(), (qsf) this.f.get());
        return qsi;
    }
}

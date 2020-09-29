package defpackage;

import io.reactivex.Flowable;

/* renamed from: qnw reason: default package */
public final class qnw implements vua<qnv> {
    private final wlc<Flowable<fpt>> a;
    private final wlc<kxz> b;
    private final wlc<qok> c;
    private final wlc<qnx> d;

    private qnw(wlc<Flowable<fpt>> wlc, wlc<kxz> wlc2, wlc<qok> wlc3, wlc<qnx> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qnw a(wlc<Flowable<fpt>> wlc, wlc<kxz> wlc2, wlc<qok> wlc3, wlc<qnx> wlc4) {
        return new qnw(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qnv((Flowable) this.a.get(), (kxz) this.b.get(), (qok) this.c.get(), (qnx) this.d.get());
    }
}

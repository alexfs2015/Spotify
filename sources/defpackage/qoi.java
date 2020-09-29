package defpackage;

import io.reactivex.Completable;

/* renamed from: qoi reason: default package */
public final class qoi implements vua<Completable> {
    private final wlc<hec> a;
    private final wlc<qok> b;
    private final wlc<qnx> c;
    private final wlc<qnt> d;

    private qoi(wlc<hec> wlc, wlc<qok> wlc2, wlc<qnx> wlc3, wlc<qnt> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qoi a(wlc<hec> wlc, wlc<qok> wlc2, wlc<qnx> wlc3, wlc<qnt> wlc4) {
        return new qoi(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (Completable) vuf.a(CC.a((hec) this.a.get(), (qok) this.b.get(), (qnx) this.c.get(), (qnt) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

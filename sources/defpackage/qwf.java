package defpackage;

import io.reactivex.Flowable;

/* renamed from: qwf reason: default package */
public final class qwf implements wig<qwe> {
    private final wzi<Flowable<fqn>> a;
    private final wzi<lbi> b;
    private final wzi<qwt> c;
    private final wzi<qwg> d;

    private qwf(wzi<Flowable<fqn>> wzi, wzi<lbi> wzi2, wzi<qwt> wzi3, wzi<qwg> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qwf a(wzi<Flowable<fqn>> wzi, wzi<lbi> wzi2, wzi<qwt> wzi3, wzi<qwg> wzi4) {
        return new qwf(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new qwe((Flowable) this.a.get(), (lbi) this.b.get(), (qwt) this.c.get(), (qwg) this.d.get());
    }
}

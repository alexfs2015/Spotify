package defpackage;

import io.reactivex.Flowable;

/* renamed from: tgg reason: default package */
public final class tgg implements wig<Flowable<tjl>> {
    private final wzi<rqb> a;
    private final wzi<fqn> b;

    private tgg(wzi<rqb> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tgg a(wzi<rqb> wzi, wzi<fqn> wzi2) {
        return new tgg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        boolean z = !((rqb) this.a.get()).a((fqn) this.b.get());
        return (Flowable) wil.a(Flowable.b(tjl.c().a(b.h().b(false).c(true).d(false).f(true).a(z).e(z).a()).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

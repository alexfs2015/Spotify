package defpackage;

import io.reactivex.Flowable;

/* renamed from: svz reason: default package */
public final class svz implements vua<Flowable<sze>> {
    private final wlc<rgz> a;
    private final wlc<fpt> b;

    private svz(wlc<rgz> wlc, wlc<fpt> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static svz a(wlc<rgz> wlc, wlc<fpt> wlc2) {
        return new svz(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        boolean z = !((rgz) this.a.get()).a((fpt) this.b.get());
        return (Flowable) vuf.a(Flowable.b(sze.c().a(b.h().b(false).c(true).d(false).f(true).a(z).e(z).a()).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

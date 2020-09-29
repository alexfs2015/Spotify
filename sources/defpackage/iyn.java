package defpackage;

import io.reactivex.Flowable;

/* renamed from: iyn reason: default package */
public final class iyn implements wig<Flowable<Boolean>> {
    private final wzi<tmb> a;

    private iyn(wzi<tmb> wzi) {
        this.a = wzi;
    }

    public static Flowable<Boolean> a(tmb tmb) {
        return (Flowable) wil.a(tmb.k(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static iyn a(wzi<tmb> wzi) {
        return new iyn(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((tmb) this.a.get());
    }
}

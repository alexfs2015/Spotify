package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: lir reason: default package */
public final class lir implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private lir(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static lir a(wzi<Flowable<fqn>> wzi) {
        return new lir(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

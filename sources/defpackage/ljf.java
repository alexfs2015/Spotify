package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: ljf reason: default package */
public final class ljf implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private ljf(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static ljf a(wzi<Flowable<fqn>> wzi) {
        return new ljf(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

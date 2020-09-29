package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: lge reason: default package */
public final class lge implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private lge(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static lge a(wzi<Flowable<fqn>> wzi) {
        return new lge(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

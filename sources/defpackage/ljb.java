package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: ljb reason: default package */
public final class ljb implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private ljb(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static ljb a(wzi<Flowable<fqn>> wzi) {
        return new ljb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

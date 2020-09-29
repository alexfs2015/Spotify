package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: ifh reason: default package */
public final class ifh implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private ifh(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static ifh a(wzi<Flowable<fqn>> wzi) {
        return new ifh(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: ieu reason: default package */
public final class ieu implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private ieu(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static ieu a(wzi<Flowable<fqn>> wzi) {
        return new ieu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

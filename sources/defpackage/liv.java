package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: liv reason: default package */
public final class liv implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private liv(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static liv a(wzi<Flowable<fqn>> wzi) {
        return new liv(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

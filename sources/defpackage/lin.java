package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Single;

/* renamed from: lin reason: default package */
public final class lin implements wig<Single<tho>> {
    private final wzi<Flowable<fqn>> a;

    private lin(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static lin a(wzi<Flowable<fqn>> wzi) {
        return new lin(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Single) wil.a(CC.a((Flowable) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

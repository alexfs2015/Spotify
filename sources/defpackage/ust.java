package defpackage;

import io.reactivex.Flowable;

/* renamed from: ust reason: default package */
public final class ust implements wig<uss> {
    private final wzi<Flowable<fqn>> a;

    private ust(wzi<Flowable<fqn>> wzi) {
        this.a = wzi;
    }

    public static ust a(wzi<Flowable<fqn>> wzi) {
        return new ust(wzi);
    }

    public final /* synthetic */ Object get() {
        return new uss((Flowable) this.a.get());
    }
}

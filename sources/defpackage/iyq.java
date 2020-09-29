package defpackage;

import io.reactivex.Flowable;

/* renamed from: iyq reason: default package */
public final class iyq implements wig<Flowable<tmm>> {
    private final wzi<tmf> a;

    private iyq(wzi<tmf> wzi) {
        this.a = wzi;
    }

    public static iyq a(wzi<tmf> wzi) {
        return new iyq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) wil.a(((tmf) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

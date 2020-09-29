package defpackage;

import io.reactivex.Flowable;

/* renamed from: ssr reason: default package */
public final class ssr implements vua<Flowable<urh>> {
    private final wlc<ssy> a;

    public static Flowable<urh> a(ssy ssy) {
        return (Flowable) vuf.a(ssy.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ssy) this.a.get());
    }
}

package defpackage;

import io.reactivex.Flowable;

/* renamed from: swd reason: default package */
public final class swd implements vua<Flowable<Boolean>> {
    private final wlc<Integer> a;

    public static Flowable<Boolean> a(int i) {
        return (Flowable) vuf.a(CC.a(i), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(((Integer) this.a.get()).intValue());
    }
}

package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: tsd reason: default package */
public final class tsd implements wig<Flowable<Boolean>> {
    private final wzi<Integer> a;
    private final wzi<Flowable<Boolean>> b;
    private final wzi<Scheduler> c;

    public static Flowable<Boolean> a(int i, Flowable<Boolean> flowable, Scheduler scheduler) {
        return (Flowable) wil.a(CC.a(i, flowable, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(((Integer) this.a.get()).intValue(), (Flowable) this.b.get(), (Scheduler) this.c.get());
    }
}

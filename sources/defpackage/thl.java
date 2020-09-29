package defpackage;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: thl reason: default package */
public final class thl implements vua<Flowable<Boolean>> {
    private final wlc<Integer> a;
    private final wlc<Flowable<Boolean>> b;
    private final wlc<Scheduler> c;

    public static Flowable<Boolean> a(int i, Flowable<Boolean> flowable, Scheduler scheduler) {
        return (Flowable) vuf.a(CC.a(i, flowable, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(((Integer) this.a.get()).intValue(), (Flowable) this.b.get(), (Scheduler) this.c.get());
    }
}

package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/* renamed from: via reason: default package */
public final class via implements vua<Scheduler> {
    private static final via a = new via();

    public static via a() {
        return a;
    }

    public static Scheduler b() {
        return (Scheduler) vuf.a(Schedulers.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}

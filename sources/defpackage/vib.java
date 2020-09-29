package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/* renamed from: vib reason: default package */
public final class vib implements vua<Scheduler> {
    private static final vib a = new vib();

    public static vib a() {
        return a;
    }

    public static Scheduler b() {
        return (Scheduler) vuf.a(Schedulers.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}

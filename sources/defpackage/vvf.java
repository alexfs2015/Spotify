package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/* renamed from: vvf reason: default package */
public final class vvf implements wig<Scheduler> {
    private static final vvf a = new vvf();

    public static vvf a() {
        return a;
    }

    public static Scheduler b() {
        return (Scheduler) wil.a(Schedulers.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}

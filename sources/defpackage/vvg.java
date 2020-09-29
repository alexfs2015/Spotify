package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/* renamed from: vvg reason: default package */
public final class vvg implements wig<Scheduler> {
    private static final vvg a = new vvg();

    public static vvg a() {
        return a;
    }

    public static Scheduler b() {
        return (Scheduler) wil.a(Schedulers.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}

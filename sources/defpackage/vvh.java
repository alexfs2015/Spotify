package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: vvh reason: default package */
public final class vvh implements wig<Scheduler> {
    private static final vvh a = new vvh();

    public static vvh a() {
        return a;
    }

    public static Scheduler b() {
        return (Scheduler) wil.a(AndroidSchedulers.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}

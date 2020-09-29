package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: vic reason: default package */
public final class vic implements vua<Scheduler> {
    private static final vic a = new vic();

    public static vic a() {
        return a;
    }

    public static Scheduler b() {
        return (Scheduler) vuf.a(AndroidSchedulers.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}

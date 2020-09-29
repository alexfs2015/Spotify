package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/* renamed from: kia reason: default package */
public final class kia implements wig<Scheduler> {
    static {
        new kia();
    }

    public static Scheduler a() {
        return (Scheduler) wil.a(AndroidSchedulers.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}

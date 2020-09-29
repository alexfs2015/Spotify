package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* renamed from: rer reason: default package */
public final class rer implements wig<rep> {
    private static final rer a = new rer();

    public static rer a() {
        return a;
    }

    public static rep b() {
        return (rep) wil.a(new rep() {
            public final Scheduler a() {
                return Schedulers.a();
            }

            public final Scheduler b() {
                return AndroidSchedulers.a();
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return b();
    }
}

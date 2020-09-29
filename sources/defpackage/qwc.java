package defpackage;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* renamed from: qwc reason: default package */
public final class qwc implements vua<qwa> {
    private static final qwc a = new qwc();

    public static qwc a() {
        return a;
    }

    public static qwa b() {
        return (qwa) vuf.a(new qwa() {
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

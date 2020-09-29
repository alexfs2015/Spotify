package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Type;

/* renamed from: xgx reason: default package */
final class xgx<R> implements xga<R, Object> {
    private final Type a;
    private final Scheduler b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    xgx(Type type, Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = type;
        this.b = scheduler;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    public final Object a(xfz<R> xfz) {
        Observable xgt = this.c ? new xgt(xfz) : new xgu(xfz);
        Observable observable = this.d ? new xgw(xgt) : this.e ? new xgs(xgt) : xgt;
        Scheduler scheduler = this.b;
        if (scheduler != null) {
            observable = observable.b(scheduler);
        }
        return this.f ? observable.a(BackpressureStrategy.LATEST) : this.g ? observable.h() : this.h ? RxJavaPlugins.a((Maybe<T>) new ObservableSingleMaybe<T>(observable)) : this.i ? observable.g() : RxJavaPlugins.a(observable);
    }

    public final Type a() {
        return this.a;
    }
}

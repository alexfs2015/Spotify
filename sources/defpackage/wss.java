package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Type;

/* renamed from: wss reason: default package */
final class wss<R> implements wrv<R, Object> {
    private final Type a;
    private final Scheduler b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    wss(Type type, Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
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

    public final Type a() {
        return this.a;
    }

    public final Object a(wru<R> wru) {
        Observable observable;
        if (this.c) {
            observable = new wso(wru);
        } else {
            observable = new wsp(wru);
        }
        Observable observable2 = this.d ? new wsr(observable) : this.e ? new wsn(observable) : observable;
        Scheduler scheduler = this.b;
        if (scheduler != null) {
            observable2 = observable2.b(scheduler);
        }
        if (this.f) {
            return observable2.a(BackpressureStrategy.LATEST);
        }
        if (this.g) {
            return observable2.h();
        }
        if (this.h) {
            return RxJavaPlugins.a((Maybe<T>) new ObservableSingleMaybe<T>(observable2));
        }
        if (this.i) {
            return observable2.g();
        }
        return RxJavaPlugins.a(observable2);
    }
}

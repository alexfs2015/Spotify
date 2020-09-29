package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: qvc reason: default package */
public abstract class qvc implements qul {
    private Observable<qun> a;

    /* access modifiers changed from: protected */
    public abstract Observable<qun> c();

    public final Observable<Boolean> a() {
        return d().c((Function<? super T, ? extends R>) $$Lambda$qvc$OZZKfpxSBz7GJ82kAWKXUeqsmAs.INSTANCE).a(1).a();
    }

    public final Observable<qun> a(Observable<qum> observable) {
        return d();
    }

    public final Observable<qun> b() {
        return d();
    }

    private Observable<qun> d() {
        if (this.a == null) {
            this.a = c().a(1).a();
        }
        return this.a;
    }
}

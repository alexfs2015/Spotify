package defpackage;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: gub reason: default package */
public final class gub {
    private Emitter<Boolean> a;
    private boolean b;

    public final Observable<Boolean> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$gub$jr2Iza7SNzfNUa8V1R_mYjyOgI<T>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.a = observableEmitter;
        observableEmitter.a(Boolean.valueOf(this.b));
    }

    public final void a(boolean z) {
        this.b = z;
        Emitter<Boolean> emitter = this.a;
        if (emitter != null) {
            emitter.a(Boolean.valueOf(this.b));
        }
    }
}

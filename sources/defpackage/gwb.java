package defpackage;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: gwb reason: default package */
public final class gwb {
    private Emitter<Boolean> a;
    private boolean b;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.a = observableEmitter;
        observableEmitter.a(Boolean.valueOf(this.b));
    }

    public final Observable<Boolean> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$gwb$8FeisP9e_XwrnWhwFktceuc2RDg<T>(this));
    }

    public final void a(boolean z) {
        this.b = z;
        Emitter<Boolean> emitter = this.a;
        if (emitter != null) {
            emitter.a(Boolean.valueOf(this.b));
        }
    }
}

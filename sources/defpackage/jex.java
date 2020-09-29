package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: jex reason: default package */
final class jex {
    private final jej a;

    jex(jej jej) {
        this.a = jej;
    }

    /* access modifiers changed from: 0000 */
    public final ObservableTransformer<e, jet> a() {
        return new $$Lambda$jex$pcMrbzzYrH84pYOA580hdZ2L3M8(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.h(new $$Lambda$jex$8AfwJ6ukj2NvJRQJcjydxK9kII(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(e eVar) {
        return this.a.a(eVar.a, eVar.b.g()).f($$Lambda$GPCzciG4J6zA8MRlCrzdyy0S1yI.INSTANCE).d();
    }
}

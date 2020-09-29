package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: jhm reason: default package */
final class jhm {
    private final jgy a;

    jhm(jgy jgy) {
        this.a = jgy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Observable observable) {
        return observable.h(new $$Lambda$jhm$AkfH7mXss9kurYFfZNR1hXC0kpg(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(e eVar) {
        return this.a.a(eVar.a, eVar.b.g()).f($$Lambda$vAbt_aki6WzBUY_njuu1X8VOCTU.INSTANCE).d();
    }

    /* access modifiers changed from: 0000 */
    public final ObservableTransformer<e, jhi> a() {
        return new $$Lambda$jhm$84dv23brpbvYOVRSmYJezhvDxR0(this);
    }
}

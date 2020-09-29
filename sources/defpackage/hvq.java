package defpackage;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: hvq reason: default package */
public final class hvq {
    private final hvo a;
    private final Observable<Boolean> b;

    public hvq(hvo hvo, lbi lbi) {
        this.a = hvo;
        this.b = lbi.a().a(1).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, Boolean bool) {
        return bool.booleanValue() ? Single.b(Boolean.TRUE) : this.a.a(str);
    }

    public final Single<Boolean> a(String str) {
        return this.b.d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hvq$f3vLcxxhqIfDJmhOB_8s99YrvA<Object,Object>(this, str), false).a(0, Boolean.TRUE);
    }
}

package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: vik reason: default package */
public abstract class vik implements Function<Observable<? extends Throwable>, Observable<?>> {
    final long a;
    private final int b;
    private int c;

    /* access modifiers changed from: 0000 */
    public abstract Observable<Long> a();

    public /* synthetic */ Object apply(Object obj) {
        return ((Observable) obj).b((ObservableSource<? extends U>) Observable.a(1, this.b + 1), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$4kJN0FhkvPuD0KJJuzsZkDLEsDE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vik$TLO9M6DijMB6xMjpdJ9XJhK9b7M<Object,Object>(this), false);
    }

    public vik(int i, long j) {
        this.b = i;
        this.a = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(ho hoVar) {
        this.c = ((Integer) fay.a(hoVar.b)).intValue();
        if (this.c >= this.b) {
            return Observable.a((Throwable) fay.a(hoVar.a));
        }
        return a();
    }
}

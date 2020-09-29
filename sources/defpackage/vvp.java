package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: vvp reason: default package */
public abstract class vvp implements Function<Observable<? extends Throwable>, Observable<?>> {
    final long a;
    private final int b;
    private int c;

    public vvp(int i, long j) {
        this.b = i;
        this.a = j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable a(ho hoVar) {
        this.c = ((Integer) fbp.a(hoVar.b)).intValue();
        return this.c >= this.b ? Observable.a((Throwable) fbp.a(hoVar.a)) : a();
    }

    /* access modifiers changed from: 0000 */
    public abstract Observable<Long> a();

    public /* synthetic */ Object apply(Object obj) {
        return ((Observable) obj).b((ObservableSource<? extends U>) Observable.a(1, this.b + 1), (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$4kJN0FhkvPuD0KJJuzsZkDLEsDE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vvp$xS06KnsQLZ2wDE8nPyHEIJqiycY<Object,Object>(this), false);
    }
}

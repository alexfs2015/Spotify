package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: tuj reason: default package */
public final class tuj {
    private final Observable<Boolean> a;
    private final Observable<Boolean> b;

    public tuj(Observable<Boolean> observable, Observable<Boolean> observable2) {
        this.a = observable;
        this.b = observable2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Boolean bool, Boolean bool2) {
        return (bool.booleanValue() || !bool2.booleanValue()) ? Boolean.FALSE : Boolean.TRUE;
    }

    public final Observable<gcl> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a, (ObservableSource<? extends T2>) this.b, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$tuj$OCfIxJHYxm7oYIQGIt9wnFUFXRg.INSTANCE).e(Boolean.TRUE).a(Functions.a()).b(1).a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$tuj$MqIC7QRdcOibMSFplOGtz7s8bJQ.INSTANCE);
    }
}

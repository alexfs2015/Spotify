package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$keg$-zSxslOHGXOKbGylEWEYYfUO7-s reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$keg$zSxslOHGXOKbGylEWEYYfUO7s implements ObservableTransformer {
    private final /* synthetic */ ker f$0;

    public /* synthetic */ $$Lambda$keg$zSxslOHGXOKbGylEWEYYfUO7s(ker ker) {
        this.f$0 = ker;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$keg$FFdmFAHUp4FiSYqxMk8DpHCnNw.INSTANCE, false).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$keg$aHebmrWm58wYQ9uno_J4foDl_HU<Object,Object>(this.f$0));
    }
}

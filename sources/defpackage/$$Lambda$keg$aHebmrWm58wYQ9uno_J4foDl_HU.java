package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$keg$aHebmrWm58wYQ9uno_J4foDl_HU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$keg$aHebmrWm58wYQ9uno_J4foDl_HU implements ObservableTransformer {
    private final /* synthetic */ ker f$0;

    public /* synthetic */ $$Lambda$keg$aHebmrWm58wYQ9uno_J4foDl_HU(ker ker) {
        this.f$0 = ker;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a(AndroidSchedulers.a()).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$keg$t1MaQzNcTq58ttghrH9oTybONm0<Object,Object>(this.f$0), false);
    }
}

package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$jtn$WRKoOyH1eZCDA7Wu4wm8tLG_nLU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jtn$WRKoOyH1eZCDA7Wu4wm8tLG_nLU implements Callable {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ IntentFilter f$1;

    public /* synthetic */ $$Lambda$jtn$WRKoOyH1eZCDA7Wu4wm8tLG_nLU(Context context, IntentFilter intentFilter) {
        this.f$0 = context;
        this.f$1 = intentFilter;
    }

    public final Object call() {
        return vii.a(this.f$0, this.f$1).c((Function<? super T, ? extends R>) new $$Lambda$jtn$NKQmKsNhYQodLoKq1dgs9UQ9u6E<Object,Object>(this.f$0)).f((ObservableSource<? extends T>) Observable.b((Callable<? extends T>) new $$Lambda$jtn$l3fkQt7URXDqyVBXiNdYe3pL7Hw<Object>(this.f$0))).a(Functions.a());
    }
}

package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$D0d-alkmqLXhk1bSu0oHhH0zYYc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$D0dalkmqLXhk1bSu0oHhH0zYYc implements ObservableTransformer {
    private final /* synthetic */ vju f$0;

    public /* synthetic */ $$Lambda$vlg$D0dalkmqLXhk1bSu0oHhH0zYYc(vju vju) {
        this.f$0 = vju;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vlg$h5c1fZtGe8LFC0kumuir724IIXM<Object,Object>(this.f$0), false);
    }
}

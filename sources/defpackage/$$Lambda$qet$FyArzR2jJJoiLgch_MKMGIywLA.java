package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qet$FyArzR2jJJoiLgch_MKM-GIywLA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qet$FyArzR2jJJoiLgch_MKMGIywLA implements ObservableTransformer {
    private final /* synthetic */ RxResolver f$0;
    private final /* synthetic */ wug f$1;
    private final /* synthetic */ wug f$2;

    public /* synthetic */ $$Lambda$qet$FyArzR2jJJoiLgch_MKMGIywLA(RxResolver rxResolver, wug wug, wug wug2) {
        this.f$0 = rxResolver;
        this.f$1 = wug;
        this.f$2 = wug2;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$qet$BMlmvEBxQljRR8Nx9eVfJ4EU1X0<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}

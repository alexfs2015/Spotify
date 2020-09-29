package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.List;

/* renamed from: mwc reason: default package */
public final class mwc implements ObservableTransformer<a, mvx> {
    private final mwi a;
    private final mxf b;

    public mwc(mwi mwi, mxf mxf) {
        this.a = mwi;
        this.b = mxf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(a aVar) {
        return this.a.a().d().c((Function<? super T, ? extends R>) this.b).c((Function<? super T, ? extends R>) $$Lambda$mwc$b2Kg0hRF3xedbUEP9cUbpQE_8.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$mwc$wh9GpEp18xyBlcxVfCYZvN9B6Hk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mvx a(Throwable th) {
        return new g();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mvx a(List list) {
        return new h(ImmutableList.a((Collection<? extends E>) list));
    }

    public final ObservableSource<mvx> apply(Observable<a> observable) {
        return observable.h(new $$Lambda$mwc$gLYZFZ3bnqjbVpJmzNWBHKhBk9c(this));
    }
}

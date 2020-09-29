package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$rhp$E6VwAptmdXjUIZjsWX-HVrbWNyo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rhp$E6VwAptmdXjUIZjsWXHVrbWNyo implements ObservableTransformer {
    private final /* synthetic */ a f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$rhp$E6VwAptmdXjUIZjsWXHVrbWNyo(a aVar, String str, String str2) {
        this.f$0 = aVar;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$rhp$qYombofL8naTWCm2_GKna7ISSkk(this.f$0, this.f$1, this.f$2));
    }
}

package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$qza$0mIDaoYDoObql6VOLOu8XTtjyO0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qza$0mIDaoYDoObql6VOLOu8XTtjyO0 implements ObservableTransformer {
    private final /* synthetic */ a f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$qza$0mIDaoYDoObql6VOLOu8XTtjyO0(a aVar, String str, String str2) {
        this.f$0 = aVar;
        this.f$1 = str;
        this.f$2 = str2;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$qza$cRWStOfhOze2wBl9aEcUU6JP0VU(this.f$0, this.f$1, this.f$2));
    }
}

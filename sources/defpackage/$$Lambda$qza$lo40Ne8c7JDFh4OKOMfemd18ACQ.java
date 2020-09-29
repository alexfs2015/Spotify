package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qza$lo40Ne8c7JDFh4OKOMfemd18ACQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qza$lo40Ne8c7JDFh4OKOMfemd18ACQ implements Function {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ qxq f$1;
    private final /* synthetic */ a f$2;

    public /* synthetic */ $$Lambda$qza$lo40Ne8c7JDFh4OKOMfemd18ACQ(String str, qxq qxq, a aVar) {
        this.f$0 = str;
        this.f$1 = qxq;
        this.f$2 = aVar;
    }

    public final Object apply(Object obj) {
        return Observable.b(((a) obj).a).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$qza$Mc6iz2sapxKOx5m_ooghdZkjL9I<Object,Object>(this.f$1, this.f$0)).a((ObservableTransformer<? super T, ? extends R>) new $$Lambda$qza$0mIDaoYDoObql6VOLOu8XTtjyO0<Object,Object>(this.f$2, this.f$0, ((a) obj).b)).a((ObservableTransformer<? super T, ? extends R>) $$Lambda$qza$dvvbP4WnNv39BiESsrUus1fIoLc.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$usEc7aLd6bFF5O2kHZSkhDnsUTc.INSTANCE);
    }
}

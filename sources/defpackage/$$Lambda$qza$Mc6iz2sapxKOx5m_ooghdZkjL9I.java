package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qza$Mc6iz2sapxKOx5m_ooghdZkjL9I reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qza$Mc6iz2sapxKOx5m_ooghdZkjL9I implements ObservableTransformer {
    private final /* synthetic */ qxq f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$qza$Mc6iz2sapxKOx5m_ooghdZkjL9I(qxq qxq, String str) {
        this.f$0 = qxq;
        this.f$1 = str;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$qza$nhzCjmNU6GqCZSbXDjJlbVnADcE<Object,Object>(this.f$0, this.f$1));
    }
}

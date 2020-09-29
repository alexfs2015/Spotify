package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$qza$1aWojZNUccKPkN2f-RT_ZO5416o reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qza$1aWojZNUccKPkN2fRT_ZO5416o implements ObservableTransformer {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ qxq f$1;
    private final /* synthetic */ a f$2;

    public /* synthetic */ $$Lambda$qza$1aWojZNUccKPkN2fRT_ZO5416o(String str, qxq qxq, a aVar) {
        this.f$0 = str;
        this.f$1 = qxq;
        this.f$2 = aVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$qza$lo40Ne8c7JDFh4OKOMfemd18ACQ(this.f$0, this.f$1, this.f$2));
    }
}

package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$nib$gOdqcpqmx77nEQ9qY8ljaRWggck reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nib$gOdqcpqmx77nEQ9qY8ljaRWggck implements ObservableTransformer {
    private final /* synthetic */ nij f$0;
    private final /* synthetic */ nil f$1;
    private final /* synthetic */ heq f$2;
    private final /* synthetic */ nde f$3;

    public /* synthetic */ $$Lambda$nib$gOdqcpqmx77nEQ9qY8ljaRWggck(nij nij, nil nil, heq heq, nde nde) {
        this.f$0 = nij;
        this.f$1 = nil;
        this.f$2 = heq;
        this.f$3 = nde;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$nib$C3oPLD8ACt6jO54TNN6Y4rhlEhU(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}

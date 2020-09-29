package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$psh$7WKSCtBrkyS_r48JIXF3x3yvqtA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$7WKSCtBrkyS_r48JIXF3x3yvqtA implements ObservableTransformer {
    private final /* synthetic */ pqg f$0;

    public /* synthetic */ $$Lambda$psh$7WKSCtBrkyS_r48JIXF3x3yvqtA(pqg pqg) {
        this.f$0 = pqg;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$psh$i1hEztZJzeY69BIOYombt7pE82w(this.f$0));
    }
}

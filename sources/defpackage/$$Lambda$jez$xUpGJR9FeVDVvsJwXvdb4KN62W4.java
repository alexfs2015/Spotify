package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$jez$xUpGJR9FeVDVvsJwXvdb4KN62W4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jez$xUpGJR9FeVDVvsJwXvdb4KN62W4 implements ObservableTransformer {
    private final /* synthetic */ hvl f$0;

    public /* synthetic */ $$Lambda$jez$xUpGJR9FeVDVvsJwXvdb4KN62W4(hvl hvl) {
        this.f$0 = hvl;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$jez$MlEUc4QhyDx25A6x4BhASntbqzA(this.f$0));
    }
}

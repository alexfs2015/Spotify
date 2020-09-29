package defpackage;

import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$nxt$1IjVma5-Eb9rM3TdofyU5XP5D6c reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nxt$1IjVma5Eb9rM3TdofyU5XP5D6c implements ObservableTransformer {
    private final /* synthetic */ uwm f$0;

    public /* synthetic */ $$Lambda$nxt$1IjVma5Eb9rM3TdofyU5XP5D6c(uwm uwm) {
        this.f$0 = uwm;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.b((Function<? super T, ? extends CompletableSource>) new $$Lambda$nxt$ibn9bYxnKJhqUFotDjkOJ51FPQ4<Object,Object>(this.f$0), false).e();
    }
}

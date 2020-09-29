package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$gic$2Na46S3wBIyY6hVIsfeMU9aSS1k reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gic$2Na46S3wBIyY6hVIsfeMU9aSS1k implements ObservableTransformer {
    private final /* synthetic */ gif f$0;

    public /* synthetic */ $$Lambda$gic$2Na46S3wBIyY6hVIsfeMU9aSS1k(gif gif) {
        this.f$0 = gif;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$gic$kLdS5SwdbLXgXyy9l6BEipgX0Ug(this.f$0));
    }
}

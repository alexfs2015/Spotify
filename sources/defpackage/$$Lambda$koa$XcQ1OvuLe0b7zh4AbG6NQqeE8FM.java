package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$koa$XcQ1OvuLe0b7zh4AbG6NQqeE8FM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$koa$XcQ1OvuLe0b7zh4AbG6NQqeE8FM implements ObservableTransformer {
    private final /* synthetic */ koe f$0;

    public /* synthetic */ $$Lambda$koa$XcQ1OvuLe0b7zh4AbG6NQqeE8FM(koe koe) {
        this.f$0 = koe;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$koa$lYRJnm4okqIrUk02pdePeVOBxX0(this.f$0));
    }
}

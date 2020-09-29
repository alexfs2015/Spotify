package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$koa$ey1NbKo5TArcJy0FOQdV3tS4SrI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$koa$ey1NbKo5TArcJy0FOQdV3tS4SrI implements ObservableTransformer {
    private final /* synthetic */ koe f$0;

    public /* synthetic */ $$Lambda$koa$ey1NbKo5TArcJy0FOQdV3tS4SrI(koe koe) {
        this.f$0 = koe;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$koa$ukGYqhadorfyqlfiNMb0pd6lukc(this.f$0));
    }
}

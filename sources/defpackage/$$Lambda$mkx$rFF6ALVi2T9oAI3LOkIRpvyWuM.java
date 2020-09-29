package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$mkx$rFF6ALV-i2T9oAI3LOkIRpvyWuM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mkx$rFF6ALVi2T9oAI3LOkIRpvyWuM implements ObservableTransformer {
    private final /* synthetic */ kxz f$0;
    private final /* synthetic */ mka f$1;
    private final /* synthetic */ mky f$2;

    public /* synthetic */ $$Lambda$mkx$rFF6ALVi2T9oAI3LOkIRpvyWuM(kxz kxz, mka mka, mky mky) {
        this.f$0 = kxz;
        this.f$1 = mka;
        this.f$2 = mky;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$mkx$EmTI0AfiFtqPg7z0M6KWfMtLx6s<Object,Object>(this.f$0, this.f$1, this.f$2), false);
    }
}

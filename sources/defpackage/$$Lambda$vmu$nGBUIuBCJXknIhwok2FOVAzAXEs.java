package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$vmu$nGBUIuBCJXknIhwok2FOVAzAXEs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vmu$nGBUIuBCJXknIhwok2FOVAzAXEs implements ObservableTransformer {
    private final /* synthetic */ boolean f$0;
    private final /* synthetic */ gmx f$1;

    public /* synthetic */ $$Lambda$vmu$nGBUIuBCJXknIhwok2FOVAzAXEs(boolean z, gmx gmx) {
        this.f$0 = z;
        this.f$1 = gmx;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$vmu$hYLHykEMlChJSmoFSk5PLswExaM(this.f$0, this.f$1));
    }
}

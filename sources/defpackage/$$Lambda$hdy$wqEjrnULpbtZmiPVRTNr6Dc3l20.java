package defpackage;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$hdy$wqEjrnULpbtZmiPVRTNr6Dc3l20 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$hdy$wqEjrnULpbtZmiPVRTNr6Dc3l20 implements Consumer {
    private final /* synthetic */ hdy f$0;
    private final /* synthetic */ a f$1;
    private final /* synthetic */ Observable f$2;

    public /* synthetic */ $$Lambda$hdy$wqEjrnULpbtZmiPVRTNr6Dc3l20(hdy hdy, a aVar, Observable observable) {
        this.f$0 = hdy;
        this.f$1 = aVar;
        this.f$2 = observable;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (Disposable) obj);
    }
}

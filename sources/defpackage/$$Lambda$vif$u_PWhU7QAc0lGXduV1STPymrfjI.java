package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$vif$u_PWhU7QAc0lGXduV1STPymrfjI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vif$u_PWhU7QAc0lGXduV1STPymrfjI implements ObservableOnSubscribe {
    private final /* synthetic */ vif f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ StackTraceElement[] f$2;
    private final /* synthetic */ Observable f$3;

    public /* synthetic */ $$Lambda$vif$u_PWhU7QAc0lGXduV1STPymrfjI(vif vif, String str, StackTraceElement[] stackTraceElementArr, Observable observable) {
        this.f$0 = vif;
        this.f$1 = str;
        this.f$2 = stackTraceElementArr;
        this.f$3 = observable;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f$0.b(this.f$1, this.f$2, this.f$3, observableEmitter);
    }
}

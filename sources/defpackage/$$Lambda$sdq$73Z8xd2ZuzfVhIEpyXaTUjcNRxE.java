package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$sdq$73Z8xd2ZuzfVhIEpyXaTUjcNRxE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sdq$73Z8xd2ZuzfVhIEpyXaTUjcNRxE implements FlowableOnSubscribe {
    private final /* synthetic */ sdq f$0;
    private final /* synthetic */ shr f$1;

    public /* synthetic */ $$Lambda$sdq$73Z8xd2ZuzfVhIEpyXaTUjcNRxE(sdq sdq, shr shr) {
        this.f$0 = sdq;
        this.f$1 = shr;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}

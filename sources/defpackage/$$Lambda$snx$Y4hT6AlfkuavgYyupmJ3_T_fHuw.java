package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$snx$Y4hT6AlfkuavgYyupmJ3_T_fHuw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$snx$Y4hT6AlfkuavgYyupmJ3_T_fHuw implements FlowableOnSubscribe {
    private final /* synthetic */ snx f$0;
    private final /* synthetic */ sry f$1;

    public /* synthetic */ $$Lambda$snx$Y4hT6AlfkuavgYyupmJ3_T_fHuw(snx snx, sry sry) {
        this.f$0 = snx;
        this.f$1 = sry;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}

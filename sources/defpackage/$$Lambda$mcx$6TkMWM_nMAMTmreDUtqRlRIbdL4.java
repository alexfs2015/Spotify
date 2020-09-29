package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$mcx$6TkMWM_nMAMTmreDUtqRlRIbdL4 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mcx$6TkMWM_nMAMTmreDUtqRlRIbdL4 implements FlowableOnSubscribe {
    private final /* synthetic */ mcx f$0;
    private final /* synthetic */ mbw f$1;

    public /* synthetic */ $$Lambda$mcx$6TkMWM_nMAMTmreDUtqRlRIbdL4(mcx mcx, mbw mbw) {
        this.f$0 = mcx;
        this.f$1 = mbw;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}

package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$soh$6MODuQIoCszoD_QME7OGyYX4B_o reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$soh$6MODuQIoCszoD_QME7OGyYX4B_o implements FlowableOnSubscribe {
    private final /* synthetic */ soh f$0;
    private final /* synthetic */ snm f$1;
    private final /* synthetic */ sps f$2;

    public /* synthetic */ $$Lambda$soh$6MODuQIoCszoD_QME7OGyYX4B_o(soh soh, snm snm, sps sps) {
        this.f$0 = soh;
        this.f$1 = snm;
        this.f$2 = sps;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, this.f$2, flowableEmitter);
    }
}

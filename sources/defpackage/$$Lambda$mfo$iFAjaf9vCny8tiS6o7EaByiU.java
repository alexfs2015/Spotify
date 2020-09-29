package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$mfo$iFAjaf9vC-ny8ti--S6o7EaByiU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mfo$iFAjaf9vCny8tiS6o7EaByiU implements Cancellable {
    private final /* synthetic */ mfo f$0;
    private final /* synthetic */ FlowableEmitter f$1;

    public /* synthetic */ $$Lambda$mfo$iFAjaf9vCny8tiS6o7EaByiU(mfo mfo, FlowableEmitter flowableEmitter) {
        this.f$0 = mfo;
        this.f$1 = flowableEmitter;
    }

    public final void cancel() {
        this.f$0.b(this.f$1);
    }
}

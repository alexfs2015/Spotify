package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$mka$y-2M9JBTFFuweOaDuh5FGoNC3QM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mka$y2M9JBTFFuweOaDuh5FGoNC3QM implements Cancellable {
    private final /* synthetic */ mka f$0;
    private final /* synthetic */ FlowableEmitter f$1;

    public /* synthetic */ $$Lambda$mka$y2M9JBTFFuweOaDuh5FGoNC3QM(mka mka, FlowableEmitter flowableEmitter) {
        this.f$0 = mka;
        this.f$1 = flowableEmitter;
    }

    public final void cancel() {
        this.f$0.b(this.f$1);
    }
}

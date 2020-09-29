package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$rfw$XC7jo_yHiMbJGoc9JzdF-cBCzGI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$rfw$XC7jo_yHiMbJGoc9JzdFcBCzGI implements Cancellable {
    private final /* synthetic */ rfw f$0;
    private final /* synthetic */ FlowableEmitter f$1;

    public /* synthetic */ $$Lambda$rfw$XC7jo_yHiMbJGoc9JzdFcBCzGI(rfw rfw, FlowableEmitter flowableEmitter) {
        this.f$0 = rfw;
        this.f$1 = flowableEmitter;
    }

    public final void cancel() {
        this.f$0.b(this.f$1);
    }
}

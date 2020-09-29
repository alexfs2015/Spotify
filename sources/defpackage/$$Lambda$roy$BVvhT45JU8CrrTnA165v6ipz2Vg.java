package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$roy$BVvhT45JU8CrrTnA165v6ipz2Vg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$roy$BVvhT45JU8CrrTnA165v6ipz2Vg implements Cancellable {
    private final /* synthetic */ roy f$0;
    private final /* synthetic */ FlowableEmitter f$1;

    public /* synthetic */ $$Lambda$roy$BVvhT45JU8CrrTnA165v6ipz2Vg(roy roy, FlowableEmitter flowableEmitter) {
        this.f$0 = roy;
        this.f$1 = flowableEmitter;
    }

    public final void cancel() {
        this.f$0.b(this.f$1);
    }
}

package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$nLJsih1HAzoaXsxSIRArfpzhYlM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nLJsih1HAzoaXsxSIRArfpzhYlM implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$nLJsih1HAzoaXsxSIRArfpzhYlM(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((rdc) obj);
    }
}

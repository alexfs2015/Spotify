package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$zxVLwe_JiOXaiQxGg7E5NEW8DOM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$zxVLwe_JiOXaiQxGg7E5NEW8DOM implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$zxVLwe_JiOXaiQxGg7E5NEW8DOM(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((ryc) obj);
    }
}

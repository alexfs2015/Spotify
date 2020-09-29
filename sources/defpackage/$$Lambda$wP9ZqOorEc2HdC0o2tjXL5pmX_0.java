package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$wP9ZqOorEc2HdC0o2tjXL5pmX_0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$wP9ZqOorEc2HdC0o2tjXL5pmX_0 implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$wP9ZqOorEc2HdC0o2tjXL5pmX_0(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((Float) obj);
    }
}

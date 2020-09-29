package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$0oCgbYmNTJ0-RfJi0F0-pGTA5UY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$0oCgbYmNTJ0RfJi0F0pGTA5UY implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$0oCgbYmNTJ0RfJi0F0pGTA5UY(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((opy) obj);
    }
}

package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$O4RznpO0sSK7SCORyUedOH4S2ME(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onError((Throwable) obj);
    }
}

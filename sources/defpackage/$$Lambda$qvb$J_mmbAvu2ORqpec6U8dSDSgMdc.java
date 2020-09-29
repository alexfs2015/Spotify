package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$qvb$J_mmbAvu2ORqpec6U8dSD-SgMdc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qvb$J_mmbAvu2ORqpec6U8dSDSgMdc implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$qvb$J_mmbAvu2ORqpec6U8dSDSgMdc(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext(Integer.valueOf(((qun) obj).k()));
    }
}

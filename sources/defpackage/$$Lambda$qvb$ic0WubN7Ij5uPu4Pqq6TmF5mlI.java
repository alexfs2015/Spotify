package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$qvb$ic0WubN7Ij5uP-u4Pqq6TmF5mlI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qvb$ic0WubN7Ij5uPu4Pqq6TmF5mlI implements Function {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$qvb$ic0WubN7Ij5uPu4Pqq6TmF5mlI(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$qvb$oAOSda9EiTEk9PpTm51VyVxqcTI<Object,Object>((qum) obj));
    }
}

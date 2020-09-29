package defpackage;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$rdq$90FhaxVUu-WH-roc7KfLo1scp0w reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rdq$90FhaxVUuWHroc7KfLo1scp0w implements Function {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$rdq$90FhaxVUuWHroc7KfLo1scp0w(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(Functions.a()).c((Function<? super T, ? extends R>) new $$Lambda$rdq$eOS1Lm3_tjBSxSsKfkxQ4ETGhic<Object,Object>((rdb) obj));
    }
}

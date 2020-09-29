package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$IMvDf8GfJ7NNp3Oav5n5CJZw4MY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$IMvDf8GfJ7NNp3Oav5n5CJZw4MY implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$IMvDf8GfJ7NNp3Oav5n5CJZw4MY(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((oiu) obj);
    }
}

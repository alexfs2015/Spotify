package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$rdq$3VZW-K0ttqueeUX6hO5l8DuWWoc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rdq$3VZWK0ttqueeUX6hO5l8DuWWoc implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$rdq$3VZWK0ttqueeUX6hO5l8DuWWoc(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext(Integer.valueOf(((rdc) obj).k()));
    }
}

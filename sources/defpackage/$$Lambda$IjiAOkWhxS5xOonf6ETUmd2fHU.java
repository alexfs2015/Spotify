package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$IjiAOkWhxS-5xOonf6ETUmd2fHU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$IjiAOkWhxS5xOonf6ETUmd2fHU implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$IjiAOkWhxS5xOonf6ETUmd2fHU(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((Boolean) obj);
    }
}

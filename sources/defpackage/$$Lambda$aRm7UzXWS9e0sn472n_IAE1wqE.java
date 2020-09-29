package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;

/* renamed from: -$$Lambda$aRm7UzXWS9e0sn-472n_IAE1wqE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$aRm7UzXWS9e0sn472n_IAE1wqE implements Consumer {
    private final /* synthetic */ PublishSubject f$0;

    public /* synthetic */ $$Lambda$aRm7UzXWS9e0sn472n_IAE1wqE(PublishSubject publishSubject) {
        this.f$0 = publishSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((rdc) obj);
    }
}

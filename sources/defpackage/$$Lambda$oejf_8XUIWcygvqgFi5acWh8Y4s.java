package defpackage;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;

/* renamed from: -$$Lambda$oejf_8XUIWcygvqgFi5acWh8Y4s reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$oejf_8XUIWcygvqgFi5acWh8Y4s implements Consumer {
    private final /* synthetic */ PublishSubject f$0;

    public /* synthetic */ $$Lambda$oejf_8XUIWcygvqgFi5acWh8Y4s(PublishSubject publishSubject) {
        this.f$0 = publishSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((qun) obj);
    }
}

package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: -$$Lambda$ew1Hsze41jsmUkHJw8ItQax_v_s reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ew1Hsze41jsmUkHJw8ItQax_v_s implements a {
    private final /* synthetic */ PublishSubject f$0;

    public /* synthetic */ $$Lambda$ew1Hsze41jsmUkHJw8ItQax_v_s(PublishSubject publishSubject) {
        this.f$0 = publishSubject;
    }

    public final void onChanged(Object obj) {
        this.f$0.onNext(obj);
    }
}

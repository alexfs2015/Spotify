package defpackage;

import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: -$$Lambda$kwn$Y25qm261fZAnw4iHeFHhrTfqOK0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kwn$Y25qm261fZAnw4iHeFHhrTfqOK0 implements CompletableOnSubscribe {
    private final /* synthetic */ kwn f$0;
    private final /* synthetic */ kwh f$1;

    public /* synthetic */ $$Lambda$kwn$Y25qm261fZAnw4iHeFHhrTfqOK0(kwn kwn, kwh kwh) {
        this.f$0 = kwn;
        this.f$1 = kwh;
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        this.f$0.a(this.f$1, completableEmitter);
    }
}

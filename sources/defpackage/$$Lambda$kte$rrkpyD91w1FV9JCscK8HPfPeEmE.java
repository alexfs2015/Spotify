package defpackage;

import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;

/* renamed from: -$$Lambda$kte$rrkpyD91w1FV9JCscK8HPfPeEmE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kte$rrkpyD91w1FV9JCscK8HPfPeEmE implements CompletableOnSubscribe {
    private final /* synthetic */ kte f$0;
    private final /* synthetic */ ksy f$1;

    public /* synthetic */ $$Lambda$kte$rrkpyD91w1FV9JCscK8HPfPeEmE(kte kte, ksy ksy) {
        this.f$0 = kte;
        this.f$1 = ksy;
    }

    public final void subscribe(CompletableEmitter completableEmitter) {
        this.f$0.a(this.f$1, completableEmitter);
    }
}

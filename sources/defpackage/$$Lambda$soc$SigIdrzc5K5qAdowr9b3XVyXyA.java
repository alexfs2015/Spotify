package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$soc$SigIdrzc5K5qAdowr9b3XV-yXyA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$soc$SigIdrzc5K5qAdowr9b3XVyXyA implements FlowableOnSubscribe {
    private final /* synthetic */ soc f$0;
    private final /* synthetic */ spr f$1;

    public /* synthetic */ $$Lambda$soc$SigIdrzc5K5qAdowr9b3XVyXyA(soc soc, spr spr) {
        this.f$0 = soc;
        this.f$1 = spr;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}

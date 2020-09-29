package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$soa$ZFgt9I9i5l7VvjsFWzMKIrvN9qA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$soa$ZFgt9I9i5l7VvjsFWzMKIrvN9qA implements FlowableOnSubscribe {
    private final /* synthetic */ soa f$0;
    private final /* synthetic */ spr f$1;

    public /* synthetic */ $$Lambda$soa$ZFgt9I9i5l7VvjsFWzMKIrvN9qA(soa soa, spr spr) {
        this.f$0 = soa;
        this.f$1 = spr;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}

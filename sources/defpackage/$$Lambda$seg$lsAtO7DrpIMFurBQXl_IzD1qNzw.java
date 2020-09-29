package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$seg$lsAtO7DrpIMFurBQXl_IzD1qNzw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$seg$lsAtO7DrpIMFurBQXl_IzD1qNzw implements FlowableOnSubscribe {
    private final /* synthetic */ a f$0;
    private final /* synthetic */ shr f$1;

    public /* synthetic */ $$Lambda$seg$lsAtO7DrpIMFurBQXl_IzD1qNzw(a aVar, shr shr) {
        this.f$0 = aVar;
        this.f$1 = shr;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        seg.a(this.f$0, this.f$1, flowableEmitter);
    }
}

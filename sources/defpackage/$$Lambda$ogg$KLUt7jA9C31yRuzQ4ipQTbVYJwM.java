package defpackage;

import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ogg$KLUt7jA9C31yRuzQ4ipQTbVYJwM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ogg$KLUt7jA9C31yRuzQ4ipQTbVYJwM implements SingleOnSubscribe {
    private final /* synthetic */ ogg f$0;
    private final /* synthetic */ boolean f$1;

    public /* synthetic */ $$Lambda$ogg$KLUt7jA9C31yRuzQ4ipQTbVYJwM(ogg ogg, boolean z) {
        this.f$0 = ogg;
        this.f$1 = z;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}

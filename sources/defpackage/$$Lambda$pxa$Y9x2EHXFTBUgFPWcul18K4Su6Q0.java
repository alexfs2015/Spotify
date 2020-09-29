package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pxa$Y9x2EHXFTBUgFPWcul18K4Su6Q0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pxa$Y9x2EHXFTBUgFPWcul18K4Su6Q0 implements Function {
    private final /* synthetic */ Consumer f$0;

    public /* synthetic */ $$Lambda$pxa$Y9x2EHXFTBUgFPWcul18K4Su6Q0(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final Object apply(Object obj) {
        return Completable.a((Action) new $$Lambda$pxa$GwJWlxdD5ve51U8xn_9edZ1PC6s(this.f$0, (ho) obj));
    }
}

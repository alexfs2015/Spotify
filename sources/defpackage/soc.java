package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: soc reason: default package */
public final class soc implements snz<String> {
    private final sry a;

    soc(sry sry) {
        this.a = (sry) fbp.a(sry);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        Logger.a("Retry Search for query = %s", this.a.h());
        flowableEmitter.a(this.a.h());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(spr spr, FlowableEmitter flowableEmitter) {
        spr.a = new $$Lambda$soc$v8iN9B32vnFNkbROHFoMO5EZv4(this, flowableEmitter);
        flowableEmitter.a(new $$Lambda$soc$ra46c2g5AO5eQP7NKb0QnNP0hH4(spr));
    }

    public final Flowable<String> a(spr spr) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$soc$SigIdrzc5K5qAdowr9b3XVyXyA<T>(this, spr), BackpressureStrategy.LATEST);
    }
}

package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: soa reason: default package */
public final class soa implements snz<sqj> {
    private final sqj a;

    soa(String str, String str2) {
        this.a = sqj.a(str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        Logger.a("Retry Search for drilldown = %s and query = %s", this.a.a(), this.a.b());
        flowableEmitter.a(this.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(spr spr, FlowableEmitter flowableEmitter) {
        spr.a = new $$Lambda$soa$ESfuKWHcn3qygx3ne4jmu9KXfQ(this, flowableEmitter);
        flowableEmitter.a(new $$Lambda$soa$F7WnTC_bkFZBd6SDr2nR3vkD9FM(spr));
    }

    public final Flowable<sqj> a(spr spr) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$soa$ZFgt9I9i5l7VvjsFWzMKIrvN9qA<T>(this, spr), BackpressureStrategy.LATEST);
    }
}

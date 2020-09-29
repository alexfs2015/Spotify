package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: lyw reason: default package */
public final class lyw {
    private final lxt a;

    public lyw(lxt lxt) {
        this.a = (lxt) fay.a(lxt);
    }

    public final Flowable<lys> a(lxv lxv) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$lyw$jCqEbW29DgSfPgCyrAP0wYAIauw<T>(this, lxv), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lxv lxv, FlowableEmitter flowableEmitter) {
        this.a.a = new $$Lambda$lyw$9ytQwZLSeFAJya1uqVRnk6E4_dw(lxv, flowableEmitter);
        flowableEmitter.a(new $$Lambda$lyw$rGQKn9w7tY99faaMFdJtCdopxY(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(lxv lxv, FlowableEmitter flowableEmitter) {
        int a2 = lxv.a();
        String b = lxv.b();
        if (a2 > 0 && !b.isEmpty()) {
            flowableEmitter.a(lys.a(a2, b));
            Logger.b("Requesting browse next page with offset:  %d", Integer.valueOf(a2));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.a = null;
    }
}

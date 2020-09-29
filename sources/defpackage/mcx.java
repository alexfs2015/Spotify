package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: mcx reason: default package */
public final class mcx {
    private final mbu a;

    public mcx(mbu mbu) {
        this.a = (mbu) fbp.a(mbu);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.a = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mbw mbw, FlowableEmitter flowableEmitter) {
        this.a.a = new $$Lambda$mcx$Fp6ArHP6AgGO7uHpsbsbZYOzu8(mbw, flowableEmitter);
        flowableEmitter.a(new $$Lambda$mcx$kH0CAJGY6iTzfmkb7CmYSJpHdoE(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(mbw mbw, FlowableEmitter flowableEmitter) {
        int a2 = mbw.a();
        String b = mbw.b();
        if (a2 > 0 && !b.isEmpty()) {
            flowableEmitter.a(mct.a(a2, b));
            Logger.b("Requesting browse next page with offset:  %d", Integer.valueOf(a2));
        }
    }

    public final Flowable<mct> a(mbw mbw) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$mcx$6TkMWM_nMAMTmreDUtqRlRIbdL4<T>(this, mbw), BackpressureStrategy.LATEST);
    }
}

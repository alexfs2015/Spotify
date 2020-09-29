package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: sdt reason: default package */
public final class sdt implements sds<sgc> {
    private final sgc a;

    sdt(String str, String str2) {
        this.a = sgc.a(str, str2);
    }

    public final Flowable<sgc> a(sfk sfk) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sdt$1gEXPbJ0wE95gSNx28LhKb1UJU<T>(this, sfk), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sfk sfk, FlowableEmitter flowableEmitter) {
        sfk.a = new $$Lambda$sdt$Wbwvn4lhHG3imbdt4esMHSNtCbw(this, flowableEmitter);
        flowableEmitter.a(new $$Lambda$sdt$XigmE3lqzV3vyj5RS2wAW4B2uB4(sfk));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        Logger.a("Retry Search for drilldown = %s and query = %s", this.a.a(), this.a.b());
        flowableEmitter.a(this.a);
    }
}

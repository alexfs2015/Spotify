package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: sdv reason: default package */
public final class sdv implements sds<String> {
    private final shr a;

    sdv(shr shr) {
        this.a = (shr) fay.a(shr);
    }

    public final Flowable<String> a(sfk sfk) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sdv$UTjwy2v8_XygY45GR3uq5BUwjak<T>(this, sfk), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sfk sfk, FlowableEmitter flowableEmitter) {
        sfk.a = new $$Lambda$sdv$6OjZgbjZrBbdfZsbemqtkLtfyfQ(this, flowableEmitter);
        flowableEmitter.a(new $$Lambda$sdv$Qv6r1mAqN7SjJhnxcJqlRCo0p4g(sfk));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        Logger.a("Retry Search for query = %s", this.a.h());
        flowableEmitter.a(this.a.h());
    }
}

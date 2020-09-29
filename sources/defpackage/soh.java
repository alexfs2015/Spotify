package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: soh reason: default package */
public final class soh {
    private final String a;

    public soh(String str) {
        this.a = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(snm snm, FlowableEmitter flowableEmitter) {
        if (snm.c()) {
            flowableEmitter.a(sqj.a(this.a, snm.b(), snm.a()));
            Logger.b("Requesting search drill down next page for query=%s and offset=%d", snm.b(), Integer.valueOf(snm.a()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(snm snm, sps sps, FlowableEmitter flowableEmitter) {
        sps.a = new $$Lambda$soh$j_MarY1g2bhoAK3QqKB843s3bTw(this, snm, flowableEmitter);
        flowableEmitter.a(new $$Lambda$soh$1NLIaJwZg4criZ8TbaVYTWY92Y(sps));
    }

    public final Flowable<sqj> a(sps sps, snm snm) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$soh$6MODuQIoCszoD_QME7OGyYX4B_o<T>(this, snm, sps), BackpressureStrategy.LATEST);
    }
}

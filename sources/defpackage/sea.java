package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: sea reason: default package */
public final class sea {
    private final String a;

    public sea(String str) {
        this.a = str;
    }

    public final Flowable<sgc> a(sfl sfl, sdf sdf) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$sea$RtsSAhVTzPVGYT_V63796OrJGA<T>(this, sdf, sfl), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sdf sdf, sfl sfl, FlowableEmitter flowableEmitter) {
        sfl.a = new $$Lambda$sea$3RcUQkjGABPyDxfHOmAS9ZXFXHc(this, sdf, flowableEmitter);
        flowableEmitter.a(new $$Lambda$sea$xtsg1Oo0p_ChaCU6agHWDUtPDEc(sfl));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(sdf sdf, FlowableEmitter flowableEmitter) {
        if (sdf.c()) {
            flowableEmitter.a(sgc.a(this.a, sdf.b(), sdf.a()));
            Logger.b("Requesting search drill down next page for query=%s and offset=%d", sdf.b(), Integer.valueOf(sdf.a()));
        }
    }
}

package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: rfw reason: default package */
public final class rfw {
    private final Set<Emitter<Object>> a = new HashSet(1);

    public final Flowable<Object> a() {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$rfw$gkejU8N22zztnhMh0X49iUNGSzQ<T>(this), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        this.a.add(flowableEmitter);
        flowableEmitter.a(new $$Lambda$rfw$XC7jo_yHiMbJGoc9JzdFcBCzGI(this, flowableEmitter));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(FlowableEmitter flowableEmitter) {
        this.a.remove(flowableEmitter);
    }

    public final void b() {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((Emitter) it.next()).a(Integer.valueOf(1));
        }
    }
}

package defpackage;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: roy reason: default package */
public final class roy {
    private final Set<Emitter<Object>> a = new HashSet(1);

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        this.a.add(flowableEmitter);
        flowableEmitter.a(new $$Lambda$roy$BVvhT45JU8CrrTnA165v6ipz2Vg(this, flowableEmitter));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(FlowableEmitter flowableEmitter) {
        this.a.remove(flowableEmitter);
    }

    public final Flowable<Object> a() {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$roy$qcznz2ezEbWro6ROptrBUfIvJTg<T>(this), BackpressureStrategy.BUFFER);
    }

    public final void b() {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((Emitter) it.next()).a(Integer.valueOf(1));
        }
    }
}

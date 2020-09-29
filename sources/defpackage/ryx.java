package defpackage;

import android.database.Observable;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: ryx reason: default package */
public final class ryx<T> implements rze<T> {
    private final Set<T> a = new HashSet();
    private final Deque<ho<Integer, Integer>> b = new LinkedList();
    private final a c = new a(0);
    private final int d = 10;
    private final LinkedList<T> e = new LinkedList<>();

    /* renamed from: ryx$a */
    static class a extends Observable<defpackage.rze.a> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((defpackage.rze.a) it.next()).onHistoryChanged();
            }
        }
    }

    public ryx(int i) {
    }

    public final List<T> a() {
        return Collections.unmodifiableList(new ArrayList(this.e));
    }

    public final void a(List<T> list) {
        this.e.addAll(list);
        e();
        d();
        this.c.a();
    }

    public final void a(T t) {
        this.e.push(t);
        e();
        d();
        this.c.a();
    }

    public final void b(T t) {
        this.e.remove(t);
        this.c.a();
    }

    public final void b() {
        this.e.clear();
        this.c.a();
    }

    public final Flowable<List<T>> c() {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$ryx$6tJ3HBd402zzbenWtlZRazoj9uE<T>(this), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        $$Lambda$ryx$NzxI0qdupiG7Ch5Vrnc_gkpG2lw r0 = new $$Lambda$ryx$NzxI0qdupiG7Ch5Vrnc_gkpG2lw(this, flowableEmitter);
        this.c.registerObserver(r0);
        flowableEmitter.a(new ArrayList(this.e));
        flowableEmitter.a(new $$Lambda$ryx$GtwcPfLHEXRQ2uD0xDXYNradFAI(this, r0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(FlowableEmitter flowableEmitter) {
        flowableEmitter.a(new ArrayList(this.e));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.rze.a aVar) {
        this.c.unregisterObserver(aVar);
    }

    private void d() {
        if (this.e.size() - this.d > 0) {
            while (this.e.size() > this.d) {
                this.e.removeLast();
            }
        }
    }

    private void a(int i, int i2) {
        this.b.add(ho.a(Integer.valueOf(i), Integer.valueOf((i2 - i) + 1)));
    }

    private void e() {
        int size = this.e.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.a.add(this.e.get(i2))) {
                if (i == -1) {
                    i = i2;
                }
                if (i2 + 1 == size) {
                    a(i, i2);
                }
            } else if (i != -1) {
                a(i, i2 - 1);
                i = -1;
            }
        }
        this.a.clear();
        Iterator descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            ho hoVar = (ho) descendingIterator.next();
            Integer num = (Integer) hoVar.a;
            Integer num2 = (Integer) hoVar.b;
            if (!(num == null || num2 == null)) {
                this.e.subList(num.intValue(), num.intValue() + num2.intValue()).clear();
            }
            descendingIterator.remove();
        }
    }
}

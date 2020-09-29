package defpackage;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: ffj reason: default package */
class ffj implements ffq, ffr {
    private final Map<Class<?>, ConcurrentHashMap<ffp<Object>, Executor>> a = new HashMap();
    private Queue<ffo<?>> b = new ArrayDeque();
    private final Executor c;

    ffj(Executor executor) {
        this.c = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(defpackage.ffk.a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = b(r4).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(defpackage.ffo<?> r4) {
        /*
            r3 = this;
            defpackage.bwx.a(r4)
            monitor-enter(r3)
            java.util.Queue<ffo<?>> r0 = r3.b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<ffo<?>> r0 = r3.b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = defpackage.ffk.a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffj.a(ffo):void");
    }

    private synchronized Set<Entry<ffp<Object>, Executor>> b(ffo<?> ffo) {
        Map map = (Map) this.a.get(ffo.a);
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    public final synchronized <T> void a(Class<T> cls, Executor executor, ffp<? super T> ffp) {
        bwx.a(cls);
        bwx.a(ffp);
        bwx.a(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.a.get(cls)).put(ffp, executor);
    }

    public final <T> void a(Class<T> cls, ffp<? super T> ffp) {
        a(cls, this.c, ffp);
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        Queue<ffo> queue;
        synchronized (this) {
            if (this.b != null) {
                queue = this.b;
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (ffo a2 : queue) {
                a(a2);
            }
        }
    }
}

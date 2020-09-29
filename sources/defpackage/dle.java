package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dle reason: default package */
final class dle implements dys {
    private final Map<String, List<dwv<?>>> a = new HashMap();
    private final djd b;

    dle(djd djd) {
        this.b = djd;
    }

    public final synchronized void a(dwv<?> dwv) {
        String str = dwv.b;
        List list = (List) this.a.remove(str);
        if (list != null && !list.isEmpty()) {
            if (chg.a) {
                chg.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
            }
            dwv dwv2 = (dwv) list.remove(0);
            this.a.put(str, list);
            dwv2.a((dys) this);
            try {
                this.b.c.put(dwv2);
            } catch (InterruptedException e) {
                chg.c("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.b.a();
            }
        }
    }

    public final void a(dwv<?> dwv, ecs<?> ecs) {
        List<dwv> list;
        if (ecs.b == null || ecs.b.a()) {
            a(dwv);
            return;
        }
        String str = dwv.b;
        synchronized (this) {
            list = (List) this.a.remove(str);
        }
        if (list != null) {
            if (chg.a) {
                chg.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), str);
            }
            for (dwv a2 : list) {
                this.b.e.a(a2, ecs);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(defpackage.dwv<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.b     // Catch:{ all -> 0x0050 }
            java.util.Map<java.lang.String, java.util.List<dwv<?>>> r1 = r5.a     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0050 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0038
            java.util.Map<java.lang.String, java.util.List<dwv<?>>> r1 = r5.a     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0050 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x001c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
        L_0x001c:
            java.lang.String r4 = "waiting-for-response"
            r6.b(r4)     // Catch:{ all -> 0x0050 }
            r1.add(r6)     // Catch:{ all -> 0x0050 }
            java.util.Map<java.lang.String, java.util.List<dwv<?>>> r6 = r5.a     // Catch:{ all -> 0x0050 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0050 }
            boolean r6 = defpackage.chg.a     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x0036
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r1[r3] = r0     // Catch:{ all -> 0x0050 }
            defpackage.chg.b(r6, r1)     // Catch:{ all -> 0x0050 }
        L_0x0036:
            monitor-exit(r5)
            return r2
        L_0x0038:
            java.util.Map<java.lang.String, java.util.List<dwv<?>>> r1 = r5.a     // Catch:{ all -> 0x0050 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0050 }
            r6.a(r5)     // Catch:{ all -> 0x0050 }
            boolean r6 = defpackage.chg.a     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x004e
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r1[r3] = r0     // Catch:{ all -> 0x0050 }
            defpackage.chg.b(r6, r1)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r5)
            return r3
        L_0x0050:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dle.b(dwv):boolean");
    }
}
